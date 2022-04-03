/*1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
Sample Input
6 
24
Sample Output
7
11
13
17
19
23      */


import java.util.*;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt(), high=sc.nextInt();

        

        for (int i=low; i<=high; i++){   //loop 1 to  10
            
            if(i==0 || i==1){       
                
            }else{
                int count=1;
                for(int j=2; j<i; j++){   //i =6
                    if(i%j==0){    // 
                        count++;
                        break;
                    }
                }
                if(count==1){
                    System.out.println(i);
                }
            }
        }
    }
    
}
