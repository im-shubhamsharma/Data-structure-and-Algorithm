import java.util.*;

public class TheStateOfWakanda02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        inputArray(arr, sc);

        stateOfWakanda02(arr);

    }

    // input for 2D array
    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void stateOfWakanda02(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
               int a=0;
               for(int j=i; j < arr.length; j++){
                   System.out.println(arr[a][j]);
                   a++;
               }
        }
    }
}
