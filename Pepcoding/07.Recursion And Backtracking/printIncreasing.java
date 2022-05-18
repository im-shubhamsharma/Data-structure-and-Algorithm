import java.util.*;

public class printIncreasing {
    public static void printIncreasing(int n){
        if (n==0) return;
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}