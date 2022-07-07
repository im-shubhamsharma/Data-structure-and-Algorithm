import java.util.*;

public class allIndicesOfArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println("NO OUTPUT");
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if (idx == arr.length)
            return new int[fsf];

        if (arr[idx] == x) {
            int rres[] = allIndices(arr, x, idx + 1, fsf + 1);
            rres[fsf] = idx;
            return rres;
        } else {
            return allIndices(arr, x, idx + 1, fsf);
        }
    }

}