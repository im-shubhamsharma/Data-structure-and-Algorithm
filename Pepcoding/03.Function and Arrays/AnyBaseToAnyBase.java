
import java.util.Scanner;

public class AnyBaseToAnyBase {    

     //function to convert any base to decimal
    public static int getValueIndecimal(int n, int b1){
        // write your code here
        int num = 0;
        int pow = 0;
 
        while(n !=0){
            int mod = n%10;   //  n = 10001 // mod = 1
            n = n/10;
 
            num = num + (mod * (int)Math.pow(b1, pow));
            pow++;
        }
        return num;
      }
      
      //function to convert any decimal to base
      public static int getValueInBase(int n, int b){
        // write code here
        int num = 0;
        int pow = 1;

        while (n>0){
            int mod = n%b;
            n = n/b;

            num = num + (mod*pow);
            pow = pow*10;

        }
        return num;
      }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int  b2= scn.nextInt();

        int num = getValueIndecimal(n, b1);
        int finalNum = getValueInBase(num, b2);
        System.out.println(finalNum);


    }
}


