import java.io.*;
import java.util.*;

public class numberOfIslands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        int ans = numberOfIslands(arr);
        System.out.println(ans);
    }

    public static int numberOfIslands(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    floodFill(arr, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void floodFill(int[][] arr, int i, int j) {
        arr[i][j] = 2;

        // top
        if (i > 0 && arr[i - 1][j] == 0)
            floodFill(arr, i - 1, j);
        // right
        if (j < arr[i].length - 1 && arr[i][j + 1] == 0)
            floodFill(arr, i, j + 1);
        // down
        if (i < arr.length - 1 && arr[i + 1][j] == 0)
            floodFill(arr, i + 1, j);
        // left
        if (j > 0 && arr[i][j - 1] == 0)
            floodFill(arr, i, j - 1);
    }

}
