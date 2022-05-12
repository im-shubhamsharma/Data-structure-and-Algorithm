import java.io.*;
import java.util.*;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        inputArray(arr, sc);

        spiralDisplay(arr);

    }

    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void spiralDisplay(int[][] arr) {
        int rmin = 0, cmin = 0, rmax = arr.length - 1, cmax = arr[0].length - 1;

        int tne = arr.length * arr[0].length;
        int count = 0;

        while (count<tne) {

            // left wall
            for (int i = rmin; i <= rmax && count<tne; i++) {
                System.out.println(arr[i][cmin]);
                count++;
            }
            // bottom wall
            for (int i = cmin + 1; i <= cmax - 1 && count<tne; i++) {
                System.out.println(arr[rmax][i]);
                count++;
            }
            // right wall
            for (int i = rmax; i >= rmin && count<tne; i--) {
                System.out.println(arr[i][cmax]);
                count++;
            }
            // top wall
            for (int i = cmax - 1; i >= cmin + 1 && count<tne; i--) {
                System.out.println(arr[rmin][i]);
                count++;
            }

            rmin++;
            cmin++;
            rmax--;
            cmax--;

        }
    }
}
