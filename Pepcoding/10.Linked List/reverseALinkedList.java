public class reverseALinkedList {

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
    
        public int getFirst() {
          if (this.size() == 0) {
            System.out.println("List is empty");
            return -1;
          }
          return this.head.data;
        }
    
        public int getLast() {
          // write your code here
          if (this.size() == 0) {
            System.out.println("List is empty");
            return -1;
          }
          return this.tail.data;
        }
    
        public Node getNodeAt(int idx) {
          if (idx < 0 || idx >= this.size) {
            System.out.println("Invalid arguments");
            return null;
          }
          Node curr = this.head;
          for(int i=1; i<=idx; i++){
            curr = curr.next;
          }
          return curr;
        }

        public void reverseDI(){
           int left = 0, right = size-1;

           while(left < right){
              Node lnode = getNodeAt(left);
              Node rnode = getNodeAt(right);

              int temp = lnode.data;
              lnode.data = rnode.data;
              rnode.data = temp;

              left++;
              right--;
           }
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.addFirst(10);
            ll.addFirst(20);
            ll.addFirst(30);
            ll.addLast(35);
            ll.addFirst(40);
            // ll.addAtIndex(9, 1000);
    
            System.out.println(ll.size());
            System.out.println("-----------------");
            ll.display();

            System.out.println("-----------------");
            ll.reverseDI();
            ll.display();
    
        }
    }    
}
