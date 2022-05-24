import java.util.*;

public class firstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
       System.out.println(firstIndex(arr, 0, x)); 
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length) return -1;

        if(x==arr[idx]) return idx;
        return firstIndex(arr, idx+1, x);
    }

}
