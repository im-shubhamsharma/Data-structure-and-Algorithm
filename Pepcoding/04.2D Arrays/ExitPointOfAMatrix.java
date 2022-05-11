import java.io.*;
import java.util.*;

public class ExitPointOfAMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr [][] = new int[row][col];

        inputArray(arr, sc);


    }

    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void ExitPointOfAMatrix(int arr[][]){
        int nr = arr.length;   //number of rows
        int nc = arr[0].length;   //number of columns
        
 
        int i=0;
        int j=0;
        int dir = 0;
 
        int row = i;
        int col = j;
 
 
 
        while(i>= 0 && i<nr && j>= 0 && j<nc){
         dir = (dir + arr[i][j])%4;
         row = i;
         col = j;
 
           switch(dir){
               case 0: j++; // direction is east
               break;
               case 1: i++; // direction is south
               break;
               case 2: j--; // direction is west
               break;
               case 3: i--; // direction is north
               break;          
             }
        }
         System.out.println(row);
         System.out.println(col);
     }

}
