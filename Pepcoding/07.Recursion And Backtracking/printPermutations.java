import java.util.*;

public class printPermutations {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();

         printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        sb.deleteCharAt(i);
        String ros = sb.toString();
        printPermutations(ros, asf+ch);
        sb.insert(i,ch);
        }
        
    }

}