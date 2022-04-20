import java.util.*;
public class SumOfTwoArrays01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input for 1st Array
        int n1 = sc.nextInt(); //size of 1st array
        int[] a1 = new int[n1];
        for(int i=0; i<a1.length;i++){
            a1[i] = sc.nextInt();
        }

        //input for 2nd Array
        int n2 = sc.nextInt(); //size of 2nd array array
        int[] a2 = new int[n2];
        for(int i=0; i<a2.length;i++){
            a2[i] = sc.nextInt();
        }

        int[] result = sumArrays(n1,a1,n2,a2);
        displayArray(result);
    }

    public static int[] sumArrays(int n1, int[] a1, int n2,int[] a2){
        int[] sum = new int[n1>n2? n1:n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = sum.length-1;

        int carry = 0;

        while (k>=0){
             if(i>=0){
                carry = carry+a1[i];
             }
             if(j>=0){
                carry = carry+a2[j];
             }
             sum[k] = carry%10;
             carry=carry/10;

             i--;
             j--;
             k--;
        }

        if(carry==0){
            return sum;
        }else{
            int[] newSumArray = new int[sum.length+1];
            newSumArray[0]=carry;
            for(int idx=1; idx<newSumArray.length;idx++){
                 newSumArray[i]=sum[i-1];
            }
            return newSumArray;
        }
    }

    public static void displayArray(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
     
}
