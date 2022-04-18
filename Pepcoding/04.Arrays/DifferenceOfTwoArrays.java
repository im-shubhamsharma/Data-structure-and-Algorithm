/*
1. You are given a number n1, representing the size of array a1.

2. You are given n1 numbers, representing elements of array a1.

3. You are given a number n2, representing the size of array a2.

4. You are given n2 numbers, representing elements of array a2.

5. The two arrays represent digits of two numbers.

6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

*/
import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i=0; i<a1.length; i++){
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0; i<a2.length; i++){
            a2[i] = sc.nextInt();
        }

        int[] diff = new int[n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while(k>=0){
            if(i>=0){
                if (a2[j]<a1[i]){
                    a2[j] += 10;
                    a2[j-1] -= 1;
                }
                diff[k] = a2[j]-a1[i];     
            }else{
                diff[k] = a2[j]; 
            }

            i--;
            j--;
            k--;
        }
        
        int idx = 0;
        while(idx<diff.length){
            if(diff[idx]==0){

            }else{
                break;
            }
            idx++;
        }

        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }


    }
}
