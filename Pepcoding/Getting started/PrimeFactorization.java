/*1. You are required to display the prime factorisation of a number.

2. Take as input a number n.

3. Print all its prime factors from smallest to largest.



For example:

for n = 1440, the output should be: 2 2 2 2 2 3 3 5*/

import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
               
        for (int i =2; i<=n; i++){
            while(n%i==0){
                n=n/i;
                System.out.println(i);
            }
        }
        if (n != 1){
            System.out.println(n);
        }
    }
}
