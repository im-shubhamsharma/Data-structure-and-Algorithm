import java.util.Scanner;

/*
 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to calculate the inverse of array a.
 */

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        inverseArray(arr,n);    
        }

    public static void inverseArray(int[] arr, int n){
        int[] inverse = new int[n];
        for(int i=0; i<inverse.length;i++){
            inverse[arr[i]] = i;
       }
       displayArray(inverse);
    }

    public static void displayArray(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
