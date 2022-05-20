import java.util.*;

public class towerOfHanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        toh(n,n1,n2,n3);
    }

    public static void toh(int n, int src, int dest, int helper){
          if(n==0) return;
          toh(n-1,src,helper,dest);
          System.out.println(n+"["+src+" -> "+dest+"]");
          toh(n-1,helper,dest,src);
    }

}