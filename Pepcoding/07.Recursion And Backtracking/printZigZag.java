import java.util.*;

public class printZigZag {
    public static void pzz(int n){
        if(n<1) return;
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);     
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pzz(n);
    }
}
