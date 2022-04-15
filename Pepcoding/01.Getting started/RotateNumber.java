/*1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
*/
import java.util.*;

public class RotateNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //let n=152689
        int k = sc.nextInt();   //2    so output will be 891526

        int count =0;
        int temp = n;
        while(temp>0){         //loop to find length of number
            count++;
            temp=temp/10;
        }

        k=k%count;            
        if(k<0){
            k=k+count;
        }

        int div=1;           // 1526 89 so here we need div = 1000
        int mul=1;           //  and mul 10000

        for (int i=1; i<=count; i++){
            if(i<=k){
                div=div*10;   // div = 100 
            }else{
                mul=mul*10;  // 10000
            }
        }

        int q=n%div;   //152689 % 100 == 89
        int r=n/div;   //152689 / 100 == 1526

        int rotNum = (q*mul)+r;
        System.out.println(rotNum);
    }
}
