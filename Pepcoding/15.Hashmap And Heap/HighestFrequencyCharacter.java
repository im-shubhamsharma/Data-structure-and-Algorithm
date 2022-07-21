import java.io.*;
import java.util.*;

public class HighestFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = highestFrequencyCharacter(str);
        System.out.println(ch);
    }

    public static char highestFrequencyCharacter(String str){
        int idx = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        while(idx != str.length()){
            char ch = str.charAt(idx);
            if(hm.containsKey(ch)){
                int res = hm.get(ch);
                hm.put(ch, res+1);
            }else{
                hm.put(ch, 1);
            }
            idx++;
        }

        int freq = 0;
        char ans = ' ';
        for(Character key : hm.keySet()){
            if(hm.get(key) > freq){
                freq = hm.get(key);
                ans = key;
            }
        }

        return ans;
    }

}