public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head==null)
    		return null;
    	
    	if(head.next==null){
    		if(n==0)
    			return head;
    		else
    			return null;
    	}
    	
    	ListNode deleteBefore =head;
    	ListNode Nminus1Node = head;
    	for(int ii=0;ii<n-1;ii++)
    		Nminus1Node = Nminus1Node.next;
    	if(Nminus1Node.next==null)
    		return head.next;
    	else{
    		Nminus1Node = Nminus1Node.next;
    		while(Nminus1Node.next!=null){
    			Nminus1Node = Nminus1Node.next;
    			deleteBefore=deleteBefore.next;
    		}
    		deleteBefore.next =deleteBefore.next.next;
    		return head;
    	}
    	
    }
}