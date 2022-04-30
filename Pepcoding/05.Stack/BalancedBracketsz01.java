import java.util.*;

public class BalancedBracketsz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (st.peek() == '(') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (st.peek() == '{') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                if (st.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (st.peek() == '[') {
                    st.pop();
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
