import java.io.*;
import java.util.*;

public class MedianPriorityQueue {

  public static class MedianPriorityQueue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianPriorityQueue() {
      left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }

    public void add(int val) {
      // write your code here]
      if(right.size() > 0 && val > right.peek()){
        right.add(val);
      }else{
        left.add(val);
      }
      
      if(Math.abs(left.size() - right.size()) > 1){
        if(left.size() > right.size()){
          right.add(left.remove());
        }else{
          left.add(right.remove());
        }
      }
    }

    public int remove() {
      // write your code here
      if(size() == 0){
        System.out.println("Underflow");
        return -1;
      } 

      if(right.size() > left.size()){
        return right.remove();
      }else{
        return left.remove();
      }
    }

    public int peek() {
      // write your code here
      if(size() == 0){
        System.out.println("Underflow");
        return -1;
      } 

      if(right.size() > left.size()){
        return right.peek();
      }else{
        return left.peek();
      }
    }

    public int size() {
      // write your code here
      return right.size() + left.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MedianPriorityQueue qu = new MedianPriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}