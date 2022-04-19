import java.util.*;

public class BalancedBrackets {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();

       Stack<Character> st = new Stack<>();

       for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);  // (
           
           if( ch=='(' || ch=='{' || ch=='[' ){
                st.push(ch);
           }
           else if ( ch==')' || ch=='}' || ch==']' )
           {     
               if(st.size() == 0){
                   System.out.println("false");  //this is to deal with extra closed bracket
                   return;
               }else if(ch==')' && st.peek()=='('){
                   st.pop();
               }else if(ch=='}' && st.peek()=='{'){
                   st.pop();
               }else if(ch==']' && st.peek()=='['){
                   st.pop();
               }else{
                   System.out.println("false");
                   return;
               }
           }else{

           }
       }

       if(st.size() == 0){
           System.out.println("true");
        }else{
           System.out.println("false");   //this is to deal with a extra open bracket
        }
   } 
}
