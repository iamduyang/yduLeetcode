/**
 * 82. Remove Duplicates from Sorted List II
 */


public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        int curStoreVal;
        while(head!=null&&head.next!=null&&head.val==head.next.val){
            curStoreVal=head.val;
            head=head.next.next;
            while(head!=null&&head.val==curStoreVal)
                head=head.next;

        }
        if(head==null||head.next==null)
            return head;
        ListNode curNode=head.next;
        while(curNode!=null&&curNode.next!=null&&curNode.val==curNode.next.val){
            curStoreVal=curNode.val;
            curNode=curNode.next.next;
            while(curNode!=null&&curNode.val==curStoreVal)
                curNode=curNode.next;

        }
        head.next=curNode;
        ListNode preNode=curNode;
        if(curNode==null)
            return head;
        curNode=curNode.next;
        while(curNode!=null){
            while(curNode!=null&&curNode.next!=null&&curNode.val==curNode.next.val){
                curStoreVal=curNode.val;
                curNode=curNode.next.next;
                while(curNode!=null&&curNode.val==curStoreVal)
                    curNode=curNode.next;

            }
            preNode.next=curNode;
            if(curNode==null||curNode.next==null)
                return head;

            preNode=curNode;

            curNode=curNode.next;
        }

        return head;

    }
}
