// input 5   then output will be:
//   1                                                               1
//   1       2                                               2       1
//   1       2       3                               3       2       1
//   1       2       3       4               4       3       2       1
//   1       2       3       4       5       4       3       2       1

import java.util.Scanner; 

public class Pattern16 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int st = 1;
       int sp = 2*n - 3;

       for (int i=1; i<=n; i++){
           //loop to print stars
           for (int j=1; j<=st; j++){
               System.out.print(j + "\t");
           }
           //loop to print space
           for (int j=1; j<=sp; j++){
            System.out.print("\t");
           }
           //loop to print stars
           int num = i;
           if(i == n){
               st--;
               num--;
           }
           for (int j=1; j<=st; j++){
               System.out.print(num+"\t");
               num--;
           }

           st++;
           sp -= 2;
           System.out.println();

       }
   } 
}
