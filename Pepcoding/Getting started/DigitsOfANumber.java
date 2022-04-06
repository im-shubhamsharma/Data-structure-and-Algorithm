// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Constraints
// 1 <= n < 10^9
import java.util.*;

public class DigitsOfANumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        while (temp != 0){    ///this loop is to find total length/digit of number
            count++;
            temp=temp/10;
        }

        while(count != 0){
            int dig = n / (int)(Math.pow(10, count-1)); //Math.pow will return double value like 100.00 so we used (int)
            System.out.println(dig);
            n = n % (int)(Math.pow(10, count-1));
            count--;
        }
    }
}
