class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {

    public Node insertInMid(Node head, int data) {
        // Insert code here, return the head of modified linked list
        Node fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node n = new Node(data);
        n.next = slow.next;
        slow.next = n;

        return head;
    }
}