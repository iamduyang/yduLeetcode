/**
 * 143. Reorder List
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return ;
        int lenListNode = lengthNode(head);

        int halfLen=lenListNode/2;
        ListNode curNode =head;
        for(int i=0;i<halfLen-1;i++)
            curNode=curNode.next;
        ListNode secondCur=curNode.next;
        curNode.next=null;
        secondCur=reverseList(secondCur);


        ListNode firstCur=head, firstNext,secondNext;



        if(lenListNode%2==1){
            for (int i = 0; i < halfLen-1; i++) {
                firstNext = firstCur.next;
                secondNext = secondCur.next;
                firstCur.next = secondCur;
                secondCur.next = firstNext;
                firstCur = firstNext;
                secondCur = secondNext;
            }

            firstCur.next = secondCur;

        }
        else {
            for (int i = 0; i < halfLen; i++) {
                firstNext = firstCur.next;
                secondNext = secondCur.next;
                firstCur.next = secondCur;
                secondCur.next = firstNext;
                firstCur = firstNext;
                secondCur = secondNext;
            }
        }



    }

    public int lengthNode(ListNode head){
        int returnCount = 0;
        while(head!=null){
            head=head.next;
            returnCount++;
        }
        return returnCount;
    }

    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode firstNode =null;
        ListNode preNode =head;
        ListNode returnHead =preNode.next;
        while(returnHead.next!=null){
            preNode.next=firstNode;
            firstNode=preNode;
            preNode=returnHead;
            returnHead=returnHead.next;
        }
        preNode.next=firstNode;
        returnHead.next=preNode;



        return returnHead;
    }
}


