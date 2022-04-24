import java.util.*;

public class TheStateOfWakanda01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        int arr[][] = new int[n][m];

        inputArray(arr, sc);

        StateOfWakanda01(arr);

    }

    // input for 2D array
    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void StateOfWakanda01(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j][i]);
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[j][i]);
                }
            }

        }
    }
}
