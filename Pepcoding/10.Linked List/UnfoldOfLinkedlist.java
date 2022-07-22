import java.util.*;
public class UnfoldOfLinkedlist {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;

        while(curr != null){
            ListNode nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }

        return prev;
    }

    public static void unfold(ListNode head) {
          ListNode head1 = head;
          ListNode head2 = head.next;

          ListNode l1 = head1, l2 = head2;

         while(l1.next != null && l2.next != null){
             l1.next = l1.next.next;
             l2.next = l2.next.next;
             l1 = l1.next;
             l2 = l2.next;
         }

         head2 = reverseList(head2);
         
         l1.next = head2;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}
