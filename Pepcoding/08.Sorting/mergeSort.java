import java.util.Scanner;

public class mergeSort {
    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            int base[] = new int[1];
            base[0] = arr[low];
            return base;
        }

        int mid = (low + high) / 2;

        int left[] = mergeSort(arr, low, mid);
        int right[] = mergeSort(arr, mid + 1, high);

        return mergeTwoSortedArrays(left, right);
    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        // write your code here
        int newArr[] = new int[a.length + b.length];
        int p1 = 0, p2 = 0, i = 0;

        while (newArr.length > i) {
            int num1 = (p1 < a.length) ? a[p1] : Integer.MAX_VALUE;
            int num2 = (p2 < b.length) ? b[p2] : Integer.MAX_VALUE;

            if (num1 < num2) {
                newArr[i] = num1;
                i++;
                p1++;
            } else {
                newArr[i] = num2;
                i++;
                p2++;
            }
        }
        return newArr;
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
        int[] sa = mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted Array -> ");
        print(sa);
    }
}
