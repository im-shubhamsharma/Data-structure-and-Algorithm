import java.util.*;

public class mergeTwoSortedArrays {

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
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
    }

}