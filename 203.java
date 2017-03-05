/** 
 * 203. Remove Linked List Elements
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val)
        	head=head.next;
        if(head==null)
        	return head;
        
        ListNode cur = head;
       
        while(cur!=null&&cur.next!=null){
        	while(cur.next!=null&&cur.next.val==val)
        		cur.next=cur.next.next;
        	cur=cur.next;
        	
        	
        }
        return head;
    }
}