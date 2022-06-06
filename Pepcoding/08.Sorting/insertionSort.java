import java.util.Scanner;

public class insertionSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);
        System.out.println("--------------------");
        displayArray(arr);
    }

    public static void insertionSort(int[] arr) {
        int st = 1;
        int n = arr.length; 

        while(st!=n){
            for(int i=st;i>0;i--){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }else{
                    break;
                }
            }
            st++;
        }

    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

