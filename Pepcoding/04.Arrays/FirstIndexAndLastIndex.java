import java.util.*;

public class FirstIndexAndLastIndex {
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int[] arr = new int[n];

         for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
         }
         
         int d = sc.nextInt();

         System.out.println(searchFirstIndex(arr, d));
         System.out.println(searchLastIndex(arr, d));
     }

     public static int searchFirstIndex(int[] arr, int d){

        int left = 0;
        int right = arr.length-1;

        int idx = -1;

        // if(d == arr[left]){
        //     idx = left;
        //     return idx;
        // }

        while(left<=right){
            int mid = (left+right)/2;

            if (arr[mid] == d){
                idx = mid;
                right = mid-1;
            }else if(d > arr[mid]){
                left = mid+1;
            }else if(d < arr[mid]){
                right = mid-1;
            }
        }
        return idx;
     }

     public static int searchLastIndex(int[] arr, int d){

        int left = 0;
        int right = arr.length-1;

        int idx = -1;

        // if(d == arr[right]){
        //     idx = right;
        //     return idx;
        // }

        while(left<=right){
            int mid = (left+right)/2;

            if (arr[mid] == 2){
                idx = mid;
                left = mid+1;
            }else if(d > arr[mid]){
                left = mid+1;
            }else if(d < arr[mid]){
                right = mid-1;
            }
        }
        return idx;
     }

}
