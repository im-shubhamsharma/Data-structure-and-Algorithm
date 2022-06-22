import java.util.*;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.size() == 0) {
                    return false;
                } else if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        if (st.size() != 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = balancedBrackets(str);
        System.out.println(result);
    }
}
