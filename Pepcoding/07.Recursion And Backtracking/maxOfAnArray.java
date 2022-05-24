import java.util.*;

public class maxOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(maxOfArray(arr, 0)); 
    }

    public static int maxOfArray(int[] arr, int idx){
      if(idx==arr.length) return Integer.MIN_VALUE;

      int max = maxOfArray(arr, idx+1);
      
      if(arr[idx] > max) return arr[idx];
      return max;
    }

}
