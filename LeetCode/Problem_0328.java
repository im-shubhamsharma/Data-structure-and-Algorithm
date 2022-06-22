class Problem_0328 {
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

    public ListNode oddEvenList(ListNode head) {
        ListNode dEven = new ListNode(-1);
        ListNode dOdd = new ListNode(-1);
        
        ListNode evenTail = dEven, oddTail = dOdd, curr = head;
        int idx = 0;
        while(curr != null){
            if(idx%2 == 0){
                evenTail.next = curr;
                evenTail = evenTail.next;
            }else{
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
            idx++;
        }
        oddTail.next = null;
        
        evenTail.next = dOdd.next;
        
        return dEven.next;  
    }
}