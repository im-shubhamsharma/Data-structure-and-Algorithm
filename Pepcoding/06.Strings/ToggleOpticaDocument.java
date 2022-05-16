import java.io.*;
import java.util.*;

public class ToggleOpticaDocument {
    public static String toggleCase(String str) {
         String ans = "";
         
         for(int i=0; i<str.length();i++){
             char ch = str.charAt(i);

             if(ch >= 'a' && ch <= 'z'){
                char uc = (char)('A' + (ch - 'a')); // 'a' - lowercase = 'A' - uppercase
                ans += uc;
             }else if(ch >= 'A' && ch <= 'Z'){
                char lc = (char)('a' + (ch - 'A'));
                ans += lc;
             }
         }

         return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

    /*
     * public static String toggleCase(String str){
     * String s = "";
     * for(int i=0; i<str.length(); i++){
     * String ch = "" + str.charAt(i);
     * if(ch==ch.toLowerCase()){
     * s += ch.toUpperCase();
     * }else{
     * s += ch.toLowerCase();
     * }
     * }
     * 
     * return s;
     * }
     */

}
