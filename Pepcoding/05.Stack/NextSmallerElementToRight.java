import java.util.*;

public class NextSmallerElementToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputArray(arr, sc);

        int[] newArr = new int[arr.length];

        NextSmallerElementToRight(arr, newArr);
        displayArray(newArr);
    }


    public static void inputArray(int[] arr, Scanner sc){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArray(int[] newArr){
        for(int i=0; i<newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }

    public static void NextSmallerElementToRight(int[] arr, int[] newArr){
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        newArr[arr.length-1] = -1;
   
       for(int i=arr.length-2; i>=0; i--){
           int num = arr[i];

           while(st.size()>0 && st.peek()>num){
               st.pop();
           }

           if(st.size()==0){
              newArr[i] = -1;
           }else{
            newArr[i] = st.peek();
           }

           st.push(num);
       }
        
    }
}
