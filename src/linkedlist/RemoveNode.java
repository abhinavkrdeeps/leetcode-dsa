package linkedlist;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveNode {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            if(curr.val==val && prev==null){
                head=head.next;
                curr = curr.next;
            }
            else if(curr.val==val){
                prev.next=prev.next.next;
                curr=prev.next;
            }
            else{
                prev=curr;
                curr=curr.next;

            }
        }
        return head;
    }
}
