public class GetFirstLastAndAt {
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

    public int getAt(int idx) {
      // write your code here
      if (idx < 0 || idx >= this.size) {
        System.out.println("Invalid arguments");
        return -1;
      }
      if (idx == 0) {
        getFirst();
      } else if (idx == this.size - 1) {
        getLast();
      } else {
        Node curr = this.head;
        for (int i = 0; i < size; i++) {
          if (i == idx) {
            return curr.data;
          }
          curr = curr.next;
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addFirst(30);
    ll.addFirst(35);
    ll.addFirst(40);
    ll.addLast(900);
    ll.addFirst(50);

    System.out.println(ll.size());
    System.out.println("--------------");
    ll.display();
    System.out.println("--------------");
    System.out.println(ll.getFirst()); 
    System.out.println(ll.getLast());
    System.out.println(ll.getAt(3));  
  }

}
