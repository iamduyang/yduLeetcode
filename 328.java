/** 
 * 328. Odd Even Linked List
 */

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        
        ListNode oddHead=head,evenHead=head.next;
        ListNode oddTail=head,evenTail=evenHead;
        ListNode curNode = evenHead.next;
          
        int count=0;
        while(curNode!=null){
        	if(count%2==0){
        		oddTail.next=curNode;
        		oddTail=curNode;
        	}
        	else{
        		evenTail.next=curNode;
        		evenTail=curNode;
        				
        	}
        	curNode=curNode.next;
        	count++;
        	
        }
        oddTail.next=evenHead;
        evenTail.next=null;
        return oddHead;
        
    }
}