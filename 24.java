public class Solution {
    public ListNode swapPairs(ListNode head) {
    	ListNode returnListNode =head;
    	if (head==null||head.next==null)
    		return head;
    	
    	ListNode firstNode=head;
    	ListNode secondNode=head.next;
    	firstNode.next=secondNode.next;
    	secondNode.next=firstNode;
    	returnListNode=secondNode;
    	ListNode tempheadNode=head;
        while(firstNode.next!=null){
        	if(firstNode.next.next!=null){
        		tempheadNode=firstNode.next;
        		firstNode.next=firstNode.next.next;
        	}
        	else
        		break;
        	
        		
        		
        	firstNode=tempheadNode;
        	secondNode=firstNode.next;
        	firstNode.next=secondNode.next;
        	secondNode.next=firstNode;
        	
        	
        }
        	
        return returnListNode;
    }
}