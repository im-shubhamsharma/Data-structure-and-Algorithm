/* 1. You are given a number n.

 2. You've to create a pattern of * and separated by tab as shown in output format.
 
 *
 * *
 * * *
 * * * *
 * * * * *

here n is 5.
 */

import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*\t");
            }
        System.out.println();    
        }
    }
}



