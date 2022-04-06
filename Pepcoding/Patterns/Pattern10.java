/* 1. You are given a number n
   2. You've to create a pattern of * and separated by tab as shown in output format.
 
        *
     *     *
  *           *
     *     *
        *   
here n is 5.
 */
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int os = n/2;  //outer space
        int is = -1;  //inner space

        for(int i=1; i<=n; i++){
            for(int j=1; j<=os; j++){
            System.out.print("\t");
            }
            
            System.out.print("*\t");
            
            for(int j=1; j<=is; j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }
            
            System.out.println();

            if(i<=n/2){
                os--;
                is += 2;
            }else{
                os++;
                is -= 2;
            }
        }

    }
}
