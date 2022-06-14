public class AddLastProgram {
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

        public void addLast(int val) {
            Node node = new Node(val);

            if (this.size == 0) {
                this.head = this.tail = node;
            } else {
                tail.next = node;
                this.tail = node;
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
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(35);
        ll.addLast(40);

        System.out.println(ll.size());
        ll.display();
    }
}
