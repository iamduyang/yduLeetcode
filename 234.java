/** 
 * 234. Palindrome Linked List
 */

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        int lenHead =lengthNode(head);
        int compareLength=lenHead/2;
        ListNode tailHead =head;
        for(int i=0;i<compareLength;i++)
            tailHead=tailHead.next;
        ListNode tailReverse = reverseList(tailHead);
        for(int i=0;i<compareLength;i++){
            if(tailReverse.val!=head.val)
                return false;
            tailReverse=tailReverse.next;
            head=head.next;
        }
        return true;
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