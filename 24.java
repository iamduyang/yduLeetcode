public class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head==null||head.next==null)
            return head;
         
        ListNode firstNode=head;
        ListNode secondNode=head.next;
        firstNode.next=secondNode.next;
        secondNode.next=firstNode;
        ListNode returnListNode =secondNode;
        while(firstNode.next!=null){
            if(firstNode.next.next!=null){
                secondNode=firstNode.next;
                firstNode.next=firstNode.next.next;
            }
            else
                break;
        
            firstNode=secondNode;
            secondNode=firstNode.next;
            firstNode.next=secondNode.next;
            secondNode.next=firstNode;
    
        }
            
        return returnListNode;
    }
}