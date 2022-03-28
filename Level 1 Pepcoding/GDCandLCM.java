/*1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 

2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 

3. Take input "num1" and "num2" as the two numbers. 

4. Print their GCD and LCM.
*/
import java.util.Scanner;

public class GDCandLCM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();    
        int num2 = sc.nextInt();   
        
        int n1 = num1;
        int n2 = num2;     //we will need original value to calculate lcm

        while(num1%num2 != 0){      
            int rem = num1%num2;     
            num1 = num2;    
            num2 = rem;   
        }

        int gcd = num2;

        int lcm = (n1*n2) / gcd;      //lcm*gcd = n1*n2  

        System.out.println(gcd);
        System.out.println(lcm);
    }   
}
