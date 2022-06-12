public class AddFirstProgram {
    private static class Node{
        int data;
        Node next;

        Node(){
            data = 0;
            next = null;
        }
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }

    private static class LinkedList{
        Node head, tail;
        int size;

        LinkedList(){
            head = null;
            tail = null;
            size = 0;
        }

        public void addFirst(int val){
           Node node = new Node(val);

           if(this.size==0){
              this.head = this.tail = node;
           }else{
              node.next = this.head;
              this.head = node;
           }
           this.size++;
        }
    }
    
    public static void main(){
          add.first(10);
          add.first(20);
          add.first(30);
    }
}
