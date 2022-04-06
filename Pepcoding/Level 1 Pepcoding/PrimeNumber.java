// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.*;

public class PrimeNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1; i<=t; i++){
            int n = sc.nextInt();

            if(n==0 || n==1){
                System.out.println("not prime");
            }
            else{
                int count = 0;
                for(int j=2; j*j<=n;j++){        //j*j>=n is used to reduce time complexity
                   if(n%j==0){                   //actually we are running loop till root of n.
                       count++;
                       break;                    //break is also used to reduce time complexity
                   } 
                }  
                  
                if (count == 0){
                    System.out.println("prime");                 
                }
                else{
                    System.out.println("not prime");
                }
            }
        }       
    }
}