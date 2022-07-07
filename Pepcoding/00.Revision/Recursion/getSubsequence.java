import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> ans = new ArrayList<String>();

        // exclude
        for (String ss : rres) {
            ans.add(ss);
        }
        // include
        for (String ss : rres) {
            ans.add(ch + ss);
        }

        return ans;
    }

}