/*
 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.
 */
import java.util.*;

public class ReverseAnArray {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int[] a = new int[n];
       for(int i=0;i<n;i++){
           a[i] = sc.nextInt();
       }
       
       reverseArray(a);

   }
   
   public static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    
            i++;
            j--;
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
   }
}
