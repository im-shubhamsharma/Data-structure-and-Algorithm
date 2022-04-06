// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

// Constraints
// 1 <= n < 10^9

// Example
// Sample Input

// 65784383

// Sample Output
// 3
// 8
// 3
// 4
// 8
// 7
// 5
// 6

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        while (n!=0){
            int mod = n%10;    
            n = n/10;
            System.out.println(mod);
        }
    }
}
