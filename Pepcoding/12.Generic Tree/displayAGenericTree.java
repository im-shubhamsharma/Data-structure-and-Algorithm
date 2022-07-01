import java.util.ArrayList;
import java.util.Stack;

public class displayAGenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children;

        Node(int val) {
            data = val;
            children = new ArrayList<>();
        }
    }

    private static Node constructGT(Integer arr[]) {
        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);
        int idx = 1;

        while (idx < arr.length) {
            Integer val = arr[idx];
            if (val == null) {
                st.pop();
            } else {
                Node n = new Node(val);
                Node par = st.peek();
                par.children.add(n);
                st.push(n);
            }
            idx++;
        }
        return root;
    }

    private static void display(Node node){
        System.out.print(node.data + " -> ");
        for(Node child : node.children){
           System.out.print(child.data + " ");
        }
        System.out.println();
        for(Node child : node.children){
            display(child);
         }
    }
    
    public static void main(String[] args) {
        Integer arr[] = {10, 20, null, 30, 50, null, 60, null, null, 40, null, null};

        Node root = constructGT(arr);
       display(root);
    }
} 
