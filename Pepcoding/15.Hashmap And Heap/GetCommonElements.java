import java.io.*;
import java.util.*;

public class GetCommonElements{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a1[] = new int[n];
    inputArr(a1, sc);

    int m = sc.nextInt();
    int a2[] = new int[m];
    inputArr(a2, sc);

    getCommonElements(a1, a2);
}

public static void getCommonElements(int[] a1, int[] a2){
    HashMap<Integer, Integer> hm = new HashMap<>();

    for(int i=0; i<a1.length; i++){
        int num = a1[i];
        if(hm.containsKey(num)){
           
        }else{
            hm.put(num,1);
        }
    }

    for(int i=0; i<a2.length; i++){
        int num = a2[i];
        if(hm.containsKey(num)){
            System.out.println(num);
            hm.remove(num);
        }
    }
}

public static void inputArr(int[] arr, Scanner sc){
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
}

}