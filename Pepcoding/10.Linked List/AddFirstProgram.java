public class AddFirstProgram {
    private static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
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
            head = null;
            tail = null;
            size = 0;
        }

        public void addFirst(int val) {
            Node node = new Node(val);

            if (this.size == 0) {
                this.head = this.tail = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        public int size(){
            return this.size;
        }

        public void display(){
            Node curr = this.head;
            while(curr != null){
                System.out.println(curr.data+" ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(35);
        ll.addFirst(40);

        System.out.println(ll.size());
        ll.display();
    }
}
