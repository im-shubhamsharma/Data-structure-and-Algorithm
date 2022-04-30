import java.util.*;

public class NextGreaterElementToRightz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        inputArray(arr, sc);

        
        int newArr[] = new int[arr.length];

        NextGreaterElementToRight(arr, newArr);
        displayArray(newArr);
    }

    public static void inputArray(int[] arr, Scanner sc){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static int[] NextGreaterElementToRight(int[] arr, int[] newArr){
        Stack<Integer> st = new Stack<>();

        st.push(0); //index of 1st element of array

        for(int i=1; i<arr.length; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                newArr[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }

        while(st.size()!=0){
            newArr[st.peek()]=-1;
            st.pop();
        }

        return newArr;
    }

    public static void displayArray(int[] newArr){
        for(int i=0; i<newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }


}
