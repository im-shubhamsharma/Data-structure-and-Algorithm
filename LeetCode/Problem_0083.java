public class Problem_0083 {
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

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode curr = head, help = curr.next;

            while (help != null) {
                if (curr.val == help.val) {
                    help = help.next;
                } else {
                    curr.next = help;
                    curr = curr.next;
                }
            }
            curr.next = null;

            return head;

        }
    }
}
