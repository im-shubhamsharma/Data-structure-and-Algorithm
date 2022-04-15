
//   *       *       *       *       *       *       *
//           *       *       *       *       *
//                   *       *       *
//                           *
//                   *       *       *
//           *       *       *       *       *
//   *       *       *       *       *       *       *

import java.util.Scanner;

public class Pattern18_1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();     //input will be oddd

       int sp = 0;
       int st = n;

       for (int i=1; i<=n; i++){
           //loop to print space
           for(int j=1; j<=sp; j++){
               System.out.print("\t");
           }
           //loop to print stars
           for(int j=1; j<=st; j++){
               if(i>1 && i <= n/2 && j>1 && j<st){
                   System.out.print("\t");
               }else{ 
                   System.out.print("*\t");
               }
           }

           System.out.println();

           if(i<=n/2){
               sp++;
               st -= 2;
           }else{
               sp--;
               st += 2;
           }
       }
   }    
}
