/** 
 * 92. Reverse Linked List II
 */
public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
	    if(m==1)
	    	return reverseListOfNitem(head,n-m+1);
	    ListNode curHead =head;
	    for(int i=2;i<m;i++)
	    	curHead=curHead.next;
	    curHead.next=reverseListOfNitem(curHead.next,n-m+1);
	    return head;
	}
	
    public ListNode reverseListOfNitem(ListNode head,int count) {
        if(head==null||head.next==null||count==0)
        	return head;
      
        ListNode firstNode =null;
        ListNode oldHeadNode =head;
        ListNode preNode =head;
        ListNode returnHead =preNode.next;
        for( int localCount =1;localCount<count;localCount++){
        	preNode.next=firstNode;
        	firstNode=preNode;
        	preNode=returnHead;
        	returnHead=returnHead.next;
        }
        preNode.next=firstNode;
        oldHeadNode.next=returnHead;

        
        
        
        return preNode;
    }
}