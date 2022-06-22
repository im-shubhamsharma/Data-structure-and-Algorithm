class Problem_2095 {
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

    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null)
            return null;

        ListNode fast = head, slow = head, helper = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            helper = slow;
            slow = slow.next;
        }

        helper.next = slow.next;
        slow.next = null;

        return head;
    }
}
