public class Problem_0203 {
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode dNode = new ListNode(-1); //dummy node
        
        ListNode helper = dNode;
        
        while(head != null){
            if(head.val == val){
                helper.next = head.next;
            }else{
                helper.next = head;
                helper = helper.next;
            }
            head = head.next;
        }
        
        return dNode.next;
    }
}
