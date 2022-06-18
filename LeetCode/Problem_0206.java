class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, nbr = null;
        while (curr != null) {
            nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }
        head = prev;
        return head;
    }
}
