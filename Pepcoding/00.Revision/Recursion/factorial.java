import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    /* 
    public static int factorial(int n){
        if(n==0) return 1;
        int rres = factorial(n-1);
        int fact = n*rres;
        return fact;
    }
    */
}
