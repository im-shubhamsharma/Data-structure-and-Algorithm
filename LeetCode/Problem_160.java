public class Problem_160 {
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

    public int size(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);

        int diff;

        ListNode p1 = headA, p2 = headB;

        if (sizeA > sizeB) {
            diff = sizeA - sizeB;
            while (diff != 0) {
                p1 = p1.next;
                diff--;
            }
        } else {
            diff = sizeB - sizeA;
            while (diff != 0) {
                p2 = p2.next;
                diff--;
            }
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}