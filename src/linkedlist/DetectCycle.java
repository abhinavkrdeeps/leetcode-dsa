package linkedlist;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class DetectCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && slowPtr !=null){
            slowPtr=slowPtr.next;
            if(fastPtr.next!=null){
                fastPtr=fastPtr.next.next;
            }else{
                break;
            }
            if(slowPtr!=null && slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
