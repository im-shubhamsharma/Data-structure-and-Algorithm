public class Problem_0021 {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dnode = new ListNode(-1); // dummy node

        ListNode p1 = list1, p2 = list2, curr = dnode;

        while (p1 != null || p2 != null) {

            int p1Val = (p1 == null) ? Integer.MAX_VALUE : p1.val;
            int p2Val = (p2 == null) ? Integer.MAX_VALUE : p2.val;

            if (p1Val <= p2Val) {
                curr.next = p1;
                curr = curr.next;
                p1 = p1.next;
            } else {
                curr.next = p2;
                curr = curr.next;
                p2 = p2.next;
            }
        }

        return dnode.next;
    }

}
