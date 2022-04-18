

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
     }
    
     public static int getValueIndecimal(int n, int b){
        // write your code here
        int num = 0;
        int pow = 0;

        while(n !=0){
            int mod = n%10;   //  n = 10001 // mod = 1
            n = n/10;

            num = num + (mod * (int)Math.pow(b, pow));
            pow++;

        }

        return num;
     }
}
