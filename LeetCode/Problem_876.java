class Problem_0876 {

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

    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast.next != null) {
            if (fast.next.next == null) {
                slow = slow.next;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}