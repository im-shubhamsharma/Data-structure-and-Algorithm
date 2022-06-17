public class removeAt {
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

        public void addFirst(int val) {
            Node node = new Node(val);

            if (size == 0) {
                this.head = this.tail = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        public void addLast(int val) {
            Node node = new Node(val);

            if (size == 0) {
                this.head = this.tail = node;
            } else {
                tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        public void addAtIndex(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
                return;
            }

            if (idx == 0) {
                addFirst(val);
                return;
            }
            if (idx == size()) {
                addLast(val);
                return;
            }

            Node curr = this.head;
            Node prev = null;

            while (idx != 0) {
                prev = curr;
                curr = curr.next;
                idx--;
            }

            Node node = new Node(val);
            prev.next = node;
            node.next = curr;
            this.size++;

        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                this.head = this.tail = null;
                size = 0;
            } else {
                this.head = this.head.next;
                size--;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                this.head = this.tail = null;
                size = 0;
            } else {
                Node curr = this.head;
                while (curr.next != tail) {
                    curr = curr.next;
                }
                this.tail = curr;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            // write your code here
            if (size == 0) {
                System.out.println("List is empty");
                return;
            }
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return;
            }
            if (idx == 0) {
                removeFirst();
                return;
            }
            if (idx == size - 1) {
                removeLast();
                return;
            }

            Node curr = this.head;
            Node prev = null;
            while (idx > 0) {
                prev = curr;
                curr = curr.next;
                idx--;
            }
            prev.next = curr.next;
            curr.next = null;
            this.size--;
        }

        public int size() {
            return this.size;
        }

        public void display() {
            Node curr = this.head;
            while (curr != null) {
                System.out.println(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(35);
        ll.addFirst(40);
        ll.addAtIndex(0, 1000);
        ll.addAtIndex(4, 2000);
        // ll.addAtIndex(9, 1000);

        System.out.println(ll.size());
        System.out.println("-----------------");
        ll.display();

        System.out.println("``````````````");
        ll.removeLast();
        System.out.println(ll.size());
        System.out.println("``````````````");
        ll.display();

        System.out.println("-----------------");
        ll.removeAt(3);
        System.out.println(ll.size());
        System.out.println("-----------------");
        ll.display();
    }
}
