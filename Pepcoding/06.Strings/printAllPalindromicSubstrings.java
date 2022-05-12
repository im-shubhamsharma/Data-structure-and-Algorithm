import java.util.*;

public class printAllPalindromicSubstrings{

    public static void solution(String str){
		//write your code here
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
              String subStr =  str.substring(i, j);
            
              if(isPalindromic(subStr)){
                  System.out.println(subStr);
              }              
            }
        }
	}

    public static boolean isPalindromic(String str){
        int left = 0, right = str.length()-1;   
        boolean flag = true; 
          while(left<right){
             if(str.charAt(left)!=str.charAt(right)){
              return false;
             }
             left++;
             right--;
          }
          return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		solution(str);
	}

}