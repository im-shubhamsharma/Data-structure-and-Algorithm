//print an arrow
//input n=5 then output:
//                   *
//                   *       *
//   *       *       *       *       *
//                   *       *
//                   *

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sp = n/2;
        int st = 1;

        for(int i=1; i<=n; i++){
            //loop to print space
            for(int j=1; j<=sp; j++){
                if(i == n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            //loop to print stars
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            System.out.println();

            if(i <= n/2){
                st++;
            }else{
                st--;
            }
        }
    }    
}