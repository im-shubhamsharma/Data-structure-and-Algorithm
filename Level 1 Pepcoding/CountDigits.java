// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

// Constraints
// 1 <= n < 10^9

import java.util.*;

public class CountDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int d=0;

        while(n != 0){    
            d++;      
            n=n/10;  
        }
        System.out.println(d);
    }
    
}
