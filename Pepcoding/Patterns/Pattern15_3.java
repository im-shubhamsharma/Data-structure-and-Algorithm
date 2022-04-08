// Sample Input
// 5
// Sample Output
// 	        	1	
//   	     2  3  4	
//        3  4  5  6  7	
// 	         2  3  4	
// 	    	    1	

import java.util.Scanner;

public class Pattern15_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 2;
        int st = 1;
        
        for(int i=1; i<=n; i++){
            int num = i;
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print(num + "\t");
                num++;
            }
            
            if(i <= n/2){
               sp--;
               st += 2;
            }else{
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}
