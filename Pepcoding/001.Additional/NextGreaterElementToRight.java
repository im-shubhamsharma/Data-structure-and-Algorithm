/* * 
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"

e.g.

for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1
*/
import java.util.*;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        int newArr[] = new int[n];


        newArr[arr.length-1] = -1;
        st.push(arr[arr.length-1]);

        
        for(int i=arr.length-2; i>=0; i--){
            int num = arr[i];

            while(st.size() > 0 && num>st.peek()){
                st.pop();
            }

            if(st.size()==0){
                newArr[i]=-1;
            }else{
                newArr[i]=st.peek();
            }
            st.push(num);
        }


        //loop to display array
        for(int i=0; i<newArr.length; i++){
            System.out.println(newArr[i]);
        }
       

    }
}
