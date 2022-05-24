import java.util.*;

public class lastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
       System.out.println(lastIndex(arr, 0, x)); 
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length) return -1;

        int ans = lastIndex(arr, idx+1, x);
        if(ans != -1) return ans;
        if(x==arr[idx]) return idx;
        return -1;
    }

}
