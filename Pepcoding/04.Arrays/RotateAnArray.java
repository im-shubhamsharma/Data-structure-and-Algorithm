/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to the left for negative values of k.
*/
import java.util.*;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateArray(arr,k);
        displayArray(arr);
    }

    public static void rotateArray(int[] arr, int k){
         
        k = k%arr.length; 
        if(k<0){
            k = k+arr.length;
        }

        reverseArray(arr, 0, arr.length-1-k);
        reverseArray(arr, arr.length-k, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }

    public static void reverseArray(int[] arr,int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
    
            left++;
            right--;
        }
   }

   public static void displayArray(int[] arr){
       for(int val:arr){
           System.out.print(val+" ");
       }
   }
   
}
