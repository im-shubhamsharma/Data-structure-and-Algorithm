import java.io.*;
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        inputArray(arr1, sc);

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        inputArray(arr2, sc);

        if(c1==r2){
            int mult[][] = new int [r1][c2];
            MatrixMultiplication(arr1, arr2, mult);
        }else{
            System.out.println("Invalid input");
        }

    }

    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void displayArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
          }
          System.out.println();
        }
      }

    public static void MatrixMultiplication(int[][] arr1, int[][] arr2, int[][] mult){
        for(int row=0; row<mult.length; row++){
            for(int col=0; col<mult[0].length; col++){
                
                    for(int i=0; i<arr2.length;i++){
                          mult[row][col] += arr1[row][i] * arr2[i][col];
                    }
            }
        }

        displayArray(mult);
    }


}