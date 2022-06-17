public class DisplayReverseLinkedListRecursive {
    private static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int data) {
            this.data = data;
            next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private static class LinkedList {
        Node head, tail;
        int size;

        LinkedList() {
            Node head = null, tail = null;
            int size = 0;
        }

        private void displayReverseHelper(Node node) {
            // write your code here
            if (node == null)
                return;

            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
        }

        public void displayReverse() {
            displayReverseHelper(head);
            System.out.println();
        }
    }
}
