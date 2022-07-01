import java.util.ArrayList;
import java.util.Stack;

public class createAGenericTree {
    private static class Node{
        int data;
        ArrayList<Node> children;

        Node (int val){
           data = val;
           children = new ArrayList<>();
        }
    }

    private static Node constructGT(Integer arr[]) {
        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);
        int idx = 1;

        while(idx < arr.length){
            Integer val = arr[idx];
            if(val == null){
                st.pop();
             }else{
                 Node n = new Node(val);
                 Node parent = st.peek();
                 parent.children.add(n); //Link
                 st.push(n);
             } 
             idx++;
        }
        return root;
    }

    private static void displayGT(Node node){
        System.out.print(node.data + " -> ");

        for(Node child : node.children){
            System.out.print(child.data + " ");
        }
        System.out.println();

        
        for(Node child : node.children){
            displayGT(child);
        }
    }

    public static int sizeGT(Node node){
        int ans = 1;
        for(Node child : node.children){
            ans += sizeGT(child);
        }
        return ans+1;
    }

    public static void main(String args[]){
       Integer arr[] = {10, 20, null, 30, 50, null, 60, null, null, 40, null, null};
       Node root = constructGT(arr);
       displayGT(root);
    }
}
