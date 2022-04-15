// 1. You are given a number n. 2. You've to write code to print it's multiplication t table up to 10 in format given below.

// Sample Input
// 3
// Sample Output

// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
