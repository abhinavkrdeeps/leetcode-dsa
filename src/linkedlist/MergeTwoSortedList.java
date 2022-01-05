package linkedlist;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        ListNode head = new ListNode();
        if(list1.val<=list2.val){
            head.val = list1.val;
            list1 = list1.next;
        }else{
            head.val = list2.val;
            list2 = list2.next;
        }
        ListNode temp = head;
        while(list1!=null && list2!=null){
            ListNode newNode = new ListNode();
            if(list1.val<=list2.val){
                newNode.val = list1.val;
                list1 = list1.next;
            }
            else{
                newNode.val = list2.val;
                list2 = list2.next;
            }
            temp.next=newNode;
            temp=temp.next;

        }
        while(list1!=null){
            ListNode newNode = new ListNode(list1.val);
            temp.next=newNode;
            temp=temp.next;
            list1=list1.next;

        }
        while(list2!=null){
            ListNode newNode = new ListNode(list2.val);
            temp.next=newNode;
            temp=temp.next;
            list2=list2.next;
        }


        return head;

    }
}
