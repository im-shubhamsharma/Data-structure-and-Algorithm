// Sample Input
// 5
// Sample Output
// 	        	1	
//   	     2  2  2	
//        3  3  3  3  3	
// 	         2  2  2	
// 	    	    1	

import java.util.Scanner;

public class Pattern15_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;
        int num = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print(num + "\t");
            }
            
            if(i <= n/2){
               sp--;
               st += 2;
               num++;
            }else{
                sp++;
                st -= 2;
                num--;
            }
            System.out.println();
            

        }
    }
}
