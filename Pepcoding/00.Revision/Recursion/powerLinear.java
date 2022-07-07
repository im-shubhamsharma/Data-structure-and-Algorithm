import java.util.*;

public class powerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(x==0) return 0;
        if(n==0) return 1;
        return x*power(x,n-1);
    }

    /*
    public static int power(int x, int n){
        if(x==0) return 0;
        if(n==0) return 1;                      
        int rres = power(x, n-1);
        int pow = x*rres;
        return pow;
    }
     */

}
