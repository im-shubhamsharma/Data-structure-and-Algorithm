import java.util.*;

public class kLevelsDown {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
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

    public static class Pair {
        Node node;
        int state;

        Pair(Node node) {
            this.node = node;
        }
    }

    public static void display(Node node) {
        if (node == null)
            return;

        if (node.left != null)
            System.out.print(node.left.data);
        System.out.print(" <-- " + node.data + " --> ");
        if (node.right != null)
            System.out.print(node.right.data);
        System.out.println();

        display(node.left);
        display(node.right);
    }

    // k level down using recursion
    public static void kLevelsDown(Node node, int k) {
        if (node == null)
            return;

        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        kLevelsDown(node.left, k - 1);
        kLevelsDown(node.right, k - 1);
    }

    // k level down using level ordr line wise approach
    public static void kLevelsDown2(Node node, int k) {
        Queue<Node> curr = new ArrayDeque<>();
        Queue<Node> next = new ArrayDeque<>();
        curr.add(node);

        while (curr.size() > 0) {
            Node rem = curr.remove();
            if (rem.left != null)
                next.add(rem.left);
            if (rem.right != null)
                next.add(rem.right);

            if (curr.size() == 0) {
                k--;
                Queue temp = curr;
                curr = next;
                next = temp;
            }

            if (k == 0) {
                while (curr.size() != 0) {
                    System.out.println(curr.remove().data);
                }
                break;
            }
        }
    }

    public static void main(String args[]) {
        Integer arr[] = { 10, 20, 40, null, null, 50, 70, null, null, null, 30, null, 60, null, null };
        int k = 2;
        // Node root = construct(arr);
        Node root = construct(arr);
        // display(root);
        kLevelsDown(root, k);
    }
}
