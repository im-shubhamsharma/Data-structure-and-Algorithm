import java.util.Scanner;

public class quickSort {
    public static void quickSort(int[] arr, int lo, int hi) {
        // write your code here
        if (hi < lo)
            return; // invalid range
        if (hi == lo)
            return; // because 1 element array is already sorted

        int mid = (lo + hi) / 2;
        swap(arr, mid, hi);

        int pivot = arr[hi];

        int pivotIdx = partition(arr, pivot, lo, hi);

        quickSort(arr, lo, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, hi);
    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        // write your code here
        int i = lo, j = lo;

        while (j <= hi) {
            if (arr[j] <= pivot) {
                swap(arr, j, i);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return (i - 1);
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
