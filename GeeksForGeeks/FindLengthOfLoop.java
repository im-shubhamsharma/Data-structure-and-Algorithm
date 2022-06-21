public class FindLengthOfLoop {
    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static int countNodesinLoop(Node head)
    {
        Node slow = head, fast = head;
        int count = 0;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                fast = head;
                
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                count++;
                fast = fast.next;
                while(slow != fast){
                    fast = fast.next;
                    count++;
                }
                return count;
            }
        }
        return count;
    }
}
