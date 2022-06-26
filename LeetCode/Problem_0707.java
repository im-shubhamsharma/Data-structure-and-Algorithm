public class Problem_0707 {
    class MyLinkedList {

        public class Node {
            int val;
            Node next;
            Node prev;

            Node() {
                this.val = 0;
                this.next = null;
            }

            Node(int val) {
                this.val = val;
                this.next = this.prev = null;
            }
        }

        private Node head, tail;
        private int size;

        public MyLinkedList() {
            this.head = this.tail = null;
            this.size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }

            Node curr = head;
            while (index != 0) {
                curr = curr.next;
                index--;
            }
            return curr.val;
        }

        // ----------------------------------------------------------

        public void addAtHead(int val) {
            Node n = new Node(val);
            if (this.size == 0) {
                this.head = this.tail = n;
            } else {
                n.next = this.head;
                this.head.prev = n;
                this.head = n;
            }
            this.size++;
        }

        // ----------------------------------------------------------

        public void addAtTail(int val) {
            Node n = new Node(val);
            if (size == 0) {
                this.head = this.tail = n;
            } else {
                this.tail.next = n;
                n.prev = this.tail;
                this.tail = n;
            }
            this.size++;
        }

        // ----------------------------------------------------------

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            } else if (index == 0) {
                addAtHead(val);

            } else if (index == size) {
                addAtTail(val);
            } else {
                Node n = new Node(val);
                Node curr = head;

                while (index != 0) {
                    curr = curr.next;
                    index--;
                }
                Node pnode = curr.prev;

                n.next = curr;
                curr.prev = n;
                pnode.next = n;
                n.prev = pnode;
                this.size++;
            }
        }

        // ----------------------------------------------------------

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            } else if (size == 0) {
                return;
            } else if (size == 1) {
                head = null;
                tail = null;
                size = 0;
            } else if (index == 0) {
                Node help = head.next;
                head.next = null;
                head = help;
                head.prev = null;
                size--;
            } else if (index == size - 1) {
                Node help = tail.prev;
                tail.prev = null;
                tail = help;
                tail.next = null;
                size--;
            } else {
                Node curr = head;

                while (index != 0) {
                    curr = curr.next;
                    index--;
                }
                Node pNode = curr.prev;
                pNode.next = curr.next;
                curr.next.prev = pNode;
                curr.next = null;
                curr.prev = null;
                size--;
            }
        }
    }

    // ----------------------------------------------------------

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
}
