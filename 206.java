/** 
 * 206. Reverse Linked List
 */
public class Solution {
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