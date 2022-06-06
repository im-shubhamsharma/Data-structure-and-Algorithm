import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        System.out.println("--------------------");
        displayArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int st = 0;
        int n = arr.length;

        while (st != n) {

            int idx = 0;
            int min = Integer.MAX_VALUE;

            for (int i = st; i < n; i++) {
                if (arr[i] < min) {
                    idx = i;
                    min = arr[i];
                }
            }

            int temp = arr[st];
            arr[st] = arr[idx];
            arr[idx] = temp;

            st++;
        }

    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
