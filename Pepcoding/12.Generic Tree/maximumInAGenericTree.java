import java.util.ArrayList;
import java.util.Stack;

public class maximumInAGenericTree {
    private static class Node{
        int data;
        ArrayList<Node> children;
        
        Node (int val){
         data = val;
         children = new ArrayList<>();
        }
    }

    private static Node constructGT(Integer arr[]){
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
        for (Node child : node.children){
            System.out.print(child.data + " ");
        }
        System.out.println();
        for(Node child : node.children){
            display(child);
        }
    }

    private static int size(Node node){
        int ans = 0;
        for(Node child : node.children){
            ans += size(child);
        }
       return ans += 1;
    }

    private static Integer max(Node node){
        int max = Integer.MIN_VALUE;
        for(Node child : node.children){
            int childMax = max(child);
            max = Math.max(max, childMax);
        }
        max  = Math.max(node.data, max);
        return max;
    }

    public static void main(String[] args) {
        Integer arr[] = {10, 20, null, 30, 50, null, 60, null, null, 40, null, null};

        Node root = constructGT(arr);
       display(root);
       System.out.println(size(root));
       System.out.println(max(root));
    }
}
