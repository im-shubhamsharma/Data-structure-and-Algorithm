import java.io.*;
import java.util.*;

public class SizeSumMaximumAndHeightOfABinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int size(Node node) {
        // write your code here
        if (node == null)
            return 0;
        return size(node.left) + size(node.right) + 1;

        // if(node == null) return 0;
        // int lsize = size(node.left);
        // int rsize = size(node.right);
        // return lsize + rsize + 1;
    }

    public static int sum(Node node) {
        // write your code here
        if (node == null)
            return 0;
        return sum(node.left) + sum(node.right) + node.data;

        // if(node == null) return 0;
        // int lsum = sum(node.left);
        // int rsum = sum(node.right);
        // return lsum + rsum + node.data;
    }

    // static int max;
    public static int max(Node node) {
        // write your code here
        if (node == null)
            return Integer.MIN_VALUE;
        return Math.max(Math.max(max(node.left), max(node.right)), node.data);

        // int lmax = max(node.left);
        // int rmax = max(node.right);
        // max = Math.max(max, lmax);
        // max = Math.max(max, rmax);
        // max = Math.max(max, node.data);
        // return max;
    }

    static int ht = -1;

    public static int height(Node node) {
        // write your code here
        if (node == null)
            return -1;
        return Math.max(height(node.left), height(node.right)) + 1;

        // int lht = height(node.left);
        // int rht = height(node.right);
        // return Math.max(lht,rht)+1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        int size = size(root);
        int sum = sum(root);
        int max = max(root);
        int ht = height(root);
        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(ht);
    }

}