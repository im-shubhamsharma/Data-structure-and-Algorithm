import java.util.*;

public class ArraysDemo {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int arr[][] = new int[n][m];

    inputArray(arr,sc);
    displayArray(arr);

  }

  // input for 2D array
  public static void inputArray(int arr[][], Scanner sc) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
  }

  // display 2D array
  public static void displayArray(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
