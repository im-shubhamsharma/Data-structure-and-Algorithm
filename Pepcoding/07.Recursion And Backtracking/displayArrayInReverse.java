import java.util.*;

public class displayArrayInReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        displayArrReverse(arr, n-1);
    }

    public static void displayArrReverse(int[] arr, int idx){
        if(idx<0) return;
        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);
    }

    /*Alternate way
    displayArrReverse(arr, 0);

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==arr.length) return;
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }

    */

}