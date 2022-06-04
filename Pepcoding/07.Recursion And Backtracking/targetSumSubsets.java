import java.util.*;

public class targetSumSubsets {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }
       int tar = sc.nextInt();
       printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    // set is the subset
    // sum is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        if(sum>tar){
           return;
        }
        if(idx == arr.length){
           if(sum==tar){
           System.out.println(asf+".");
           }
           return;
        }
        
        //including 
        printTargetSumSubsets(arr, idx+1, asf+arr[idx]+", ", sum+arr[idx], tar);
        // excluding
        printTargetSumSubsets(arr, idx+1, asf, sum, tar);      
    }

}
