public class RemoveLoopInLinkedList {
    class Node {
        int data;
        Node next;
    }

    public static void removeLoop(Node head) {
        Node slow = head, fast = head, temp = null;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                fast = head;

                while (fast != slow) {
                    temp = slow;
                    slow = slow.next;
                    fast = fast.next;
                }
                temp.next = null;
                return;
            }
        }
    }
}
