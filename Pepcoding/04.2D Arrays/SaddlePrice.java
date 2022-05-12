import java.io.*;
import java.util.*;

public class SaddlePrice {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        inputArray(arr, sc);

        saddlePrice(arr);

    }

    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void saddlePrice(int[][] arr){
        
        for(int i=0; i<arr.length; i++){
            int col = 0;
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][j]<arr[i][col]){
                    col = j;
                }
            }
            boolean flag=true;
            for(int j=0; j<arr.length; j++){
                if(arr[j][col]>arr[i][col]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][col]);
                return;
            }
        }
        
        System.out.println("Invalid input");
    }



}
