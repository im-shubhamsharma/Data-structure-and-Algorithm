// Find node to root path in binary tree
import java.util.*;
public class findNodeToRootPath {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node) {
            this.node = node;
        }
    }

    public static Node construct(Integer arr[]) {
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(new Pair(root));
        int idx = 1;

        while (st.size() > 0) {

            Pair tpair = st.peek();

            if (tpair.state == 0) {
                Integer vl = arr[idx++];
                if (vl != null) {
                    Node newNode = new Node(vl); // create
                    tpair.node.left = newNode; // connect
                    st.push(new Pair(newNode));
                }
                tpair.state++;
            } else if (tpair.state == 1) {
                Integer vl = arr[idx++];
                if (vl != null) {
                    Node newNode = new Node(vl); // create
                    tpair.node.right = newNode; // connect
                    st.push(new Pair(newNode));
                }
                tpair.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node){
        if(node == null) return;

        if(node.left != null) System.out.print(node.left.data);
        System.out.print(" <-- "+node.data+" --> ");
        if(node.right != null) System.out.print(node.right.data);
        System.out.println();

        display(node.left);
        display(node.right);
    }

    public static boolean find(Node node, int data){
        if(node == null) return false;
        if(node.data == data) return true;

        boolean ans =  find(node.left, data);
        if(ans) return true;
        boolean ans1 =  find(node.right, data);
        if(ans1) return true;

        return false;
    }
    
    static ArrayList<Integer> path;
    public static boolean nodeToRootPath(Node node, int data){
        if(node == null) return false;

        if(node.data == data) {
            path.add(node.data);
            return true;
        }

        boolean ans =  nodeToRootPath(node.left, data);
        if(ans){
            path.add(node.data);
            return true;
        }

        boolean ans1 =  nodeToRootPath(node.right, data);
        if(ans1){
            path.add(node.data);
            return true;
        }

        return false;
    }

    public static void main(String args[]){
        Integer arr[] = {10,20,40,null,null,50,70,null,null,null,30,null,60,null,null};
        // Node root = construct(arr);
        Node root = construct(arr);
        display(root);
        int val = 60;
        path = new ArrayList<>();
        System.out.println(find(root, val));
        nodeToRootPath(root, val);
        System.out.println(path);
    }
}
