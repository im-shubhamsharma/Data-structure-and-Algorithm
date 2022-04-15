// Sample Input
// 5
// Sample Output
// 	        	1	
//   	     2  3  2	
//        3  4  5  4  3	
// 	         2  3  2	
// 	    	    1	

import java.util.Scanner;

public class Pattern15_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;
        int num = 1;
        
        
        for(int i=1; i<=n; i++){
            //loop to print space
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }  
            
            //loop to print numbers
            int newNum = num;
            for(int j=1; j<=st; j++){
                System.out.print(newNum + "\t");
                if(j <= st/2){
                    newNum++;
                 }else{
                    newNum--;
                 }
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
