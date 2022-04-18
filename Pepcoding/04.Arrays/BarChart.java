/* 
1. You are given a number n, representing the size of array a.

2. You are given n numbers, representing elements of array a.

3. You are required to print a bar chart representing value of arr a.
*/
import java.util.*;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //loop to input array
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=max; i>0; i--){
            for(int j=0; j<arr.length; j++){
                
               if(arr[j]>=i){
                   System.out.print("*\t");
               }else{
                   System.out.print("\t");
               }
            }
            System.out.println();
        }

        
    }
}
