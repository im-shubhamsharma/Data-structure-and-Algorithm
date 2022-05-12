import java.io.*;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        inputArray(arr, sc);

        int s = sc.nextInt();
        int k = sc.nextInt();

        int[] ring = getRing(arr, s);  
        updateRing(arr, ring, s);
        display(arr);
    }

    public static void updateRing(int[][] arr, int[] ring, int s){
        int rmin=s-1, cmin=s-1, rmax=arr.length-s, cmax=arr[0].length-s;

        int idx = 0;
        //left wall
        for(int i=rmin; i<=rmax; i++){
            arr[i][cmin] = ring[idx];
            idx++;
        }
        //bottom wall
        for(int i=cmin+1; i<=cmax-1; i++){
            arr[rmax][i] = ring[idx];
            idx++;
        }
        //right wall
        for(int i=rmax; i>=rmin;i--){
            arr[i][cmax] = ring[idx];
            idx++;
        }
        //top wall
        for(int i=cmax-1; i>=cmin+1; i--){
            arr[rmin][i] = ring[idx];
            idx++;
        }
    }

    public static int[] getRing(int[][] arr, int s){
        int rmin=s-1, cmin=s-1, rmax=arr.length-s, cmax=arr[0].length-s;

        int[] ring = new int[(2*(rmax-rmin+1))+(2*(cmax-cmin-1))];
        int idx = 0;

        //left wall
        for(int i=rmin; i<=rmax; i++){
            ring[idx] = arr[i][cmin];
            idx++;
        }
        //bottom wall
        for(int i=cmin+1; i<=cmax-1; i++){
            ring[idx] = arr[rmax][i];
            idx++;
        }
        //right wall
        for(int i=rmax; i>=rmin;i--){
            ring[idx] = arr[i][cmax];
            idx++;
        }
        //top wall
        for(int i=cmax-1; i>=cmin+1; i--){
            ring[idx] = arr[rmin][i];
            idx++;
        }
        
        return ring;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inputArray(int arr[][], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void rotateArray(int[] arr, int k){
       k=k%arr.length;
       if(k<0){
           k=k+arr.length;
       }

       reverseArray(arr, 0, arr.length-k-1);
       reverseArray(arr, arr.length-k, arr.length-1);
       reverseArray(arr, 0, arr.length-1);

    }

    public static void reverseArray(int[] arr, int left, int right){
        
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}