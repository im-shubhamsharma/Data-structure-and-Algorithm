import java.util.Scanner;
import java.util.ArrayList;

public class RemovePrimes {

    public static void solution(ArrayList<Integer> al) {
        // write your code here
        for (int i = al.size() - 1; i >= 0; i--) {

            boolean flag = true;
            for (int j = 2; j * j <= al.get(i); j++) {
                if (al.get(i) % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                al.remove(i);
            } 
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

}



/*
public static void solution(ArrayList<Integer> al) {
        // write your code here
        for (int i = 0; i<al.size(); i++) {

            boolean flag = true;
            for (int j = 2; j * j <= al.get(i); j++) {
                if (al.get(i) % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                al.remove(i);
				i--;
            }
        }

}
*/
