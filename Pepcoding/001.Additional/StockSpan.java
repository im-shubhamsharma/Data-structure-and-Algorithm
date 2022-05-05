import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        inputArray(arr, sc);

        int[] span = new int[arr.length];

        stockSpan(arr,span);

        displayArray(span);

    }

    public static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArray(int[] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static void stockSpan(int[] arr, int[] span){

        Stack<Integer> st = new Stack<>();

        span[0] = 1;
        st.push(0);

        for(int i=1; i<arr.length; i++){
              
            while(st.size()>0 && arr[i] > arr[st.peek()] ){
                    st.pop();
            }

            if (st.size()==0){
                span[i] = i+1;
            }else{
                span[i] = i - st.peek();   
            }
            st.push(i);
        }

    }
}

