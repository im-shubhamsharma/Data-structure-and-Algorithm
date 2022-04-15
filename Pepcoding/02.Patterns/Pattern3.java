/* 1. You are given a number n
   2. You've to create a pattern of * and separated by tab as shown in output format.
 
         *
       * *
     * * *
   * * * *
 * * * * *
 
here n is 5.
 */
import java.util.Scanner;

public class Pattern3 {
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int sp = n-1;  //space variable
        int st = 1; //star variable
      
        for(int i=1;i<=n;i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
