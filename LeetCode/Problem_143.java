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

    public ListNode middleNode(ListNode head){
         ListNode fast = head, slow = head;
         
         while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow.next;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        
        while(curr != null){
          ListNode nbr = curr.next;
          curr.next = prev;
          prev  = curr;
          curr  = nbr;
        }
        
        return prev;
    }
    
    public void reorderList(ListNode head) {
        
        ListNode mid = middleNode(head);
        ListNode head2 = mid.next;
        mid.next = null;
        head2 = reverseList(head2);
        
        ListNode left = head, right = head2;
        
        while(right != null){
            ListNode helper = right.next;
            
            right.next = left.next;
            left.next = right;
            
            left = left.next.next;
            right = helper;
        }
        
    }
}