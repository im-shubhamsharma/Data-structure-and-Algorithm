import java.util.*;

public class printIncreasingDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasingDecreasing(n);
    }

    public static void printIncreasingDecreasing(int n){
        if (n==0) return;
        System.out.println(n);
        printIncreasingDecreasing(n-1);
        System.out.println(n);
    }

}