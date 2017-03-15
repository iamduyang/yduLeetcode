
/** 
 * 86. Partition List
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
    	if(head==null||head.next==null)
    		return head;
    	ListNode firstListHead=null;
    	ListNode secondListHead=null;
    	ListNode firstListTail=null;
    	ListNode secondListTail=null;
    	while(head!=null){
    		if(head.val<x){
    			if(firstListHead==null){
    				firstListHead=firstListTail=head;
    			}
    			else{
    				firstListTail.next=head;
    				firstListTail=head;
    			}
    		}
    		else{
    			if(secondListHead==null){
    				secondListHead=secondListTail=head;
    			}
    			else{
    				secondListTail.next=head;
    				secondListTail=head;
    			}
    		}
    		head=head.next;
    	}
    	if(firstListHead==null)
    		return secondListHead;
    	if(secondListHead==null)
    		return firstListHead;
    	firstListTail.next=secondListHead;
    	secondListTail.next=null;
    	return firstListHead;
    }
}

