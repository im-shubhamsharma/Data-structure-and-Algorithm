class Problem_0234 {
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

    public boolean isPalindrome(ListNode head) {
        // first we find mid of LinkedList
        ListNode fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // break LinkedList in 2 parts
        ListNode head2 = slow.next;
        slow.next = null;

        // reverse 2nd part of LinkedList
        ListNode prev = null, curr = head2, nbr = null;
        while (curr != null) {
            nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }
        head2 = prev;

        // now compare both parts to check for palindrome
        boolean flag = true;

        while (head != null && head2 != null) {
            if (head.val != head2.val) {
                flag = false;
                break;
            }
            head = head.next;
            head2 = head2.next;
        }
        return flag;
    }

}
