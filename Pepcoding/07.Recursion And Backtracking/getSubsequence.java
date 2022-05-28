import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> subSequence = gss(str);
        System.out.println(subSequence);

    }

    public static ArrayList<String> gss(String str) {

        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rros = gss(ros);

        ArrayList<String> ans = new ArrayList<>();

        //excluding character
        for(String ss:rros){
            ans.add(ss);
        }

        
        //including character
        for(String ss:rros){
            ans.add(ch+ss);
        }

        return ans;
    }
 
} 