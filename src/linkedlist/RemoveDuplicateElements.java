package linkedlist;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicateElements {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }

        ListNode curr= head.next;
        ListNode prev=head;
        while(curr!=null){
            if(curr.val==prev.val){
                // Remove curr Node;
                prev.next = prev.next.next;
                curr = prev.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
