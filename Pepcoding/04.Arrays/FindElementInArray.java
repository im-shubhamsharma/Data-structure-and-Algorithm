/*1.You are given a number n, representing the size of array a.

2.You are given n distinct numbers, representing elements of array a.

3. You are given another number d.

4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.*/

import java.util.*;

public class FindElementInArray {

    public static int SearchInArray(int[] arr, int x){
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(x==arr[i]){
               index = i;
            }
         }
         return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
           arr[i]=sc.nextInt();
        }
        int d = sc.nextInt();

        int result = SearchInArray(arr,d);
        System.out.println(result);    
    }
}
