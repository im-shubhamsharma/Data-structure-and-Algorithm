import java.io.*;
import java.util.*;

public class stringCompression {

	public static String compression1(String str){
		// write your code here
        String compStr = "" + str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                compStr += str.charAt(i);
            }
        }

		return compStr;
	}

	public static String compression2(String str){
		// write your code here
        
        String compStr = "" + str.charAt(0);
        
        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                if(count!=1){
                    compStr += count;
                }
                compStr += str.charAt(i);
                count = 1;
            }
        }
        if(count!=1){
            compStr += count;
		}

		return compStr;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}

