
/** 
 * 160. Intersection of Two Linked Lists
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=lenOfTheNode(headA),lenB=lenOfTheNode(headB);
        while(lenA>lenB){
        	headA=headA.next;
        	lenA--;
        }
        while(lenA<lenB){
        	headB=headB.next;
        	lenB--;
        }
        while(headA!=headB){
        	headA=headA.next;
        	headB=headB.next;
        }
    	
    	return headA;
    }
    public int lenOfTheNode(ListNode headA){
    	int returnNum =0;
    	while(headA!=null){
    		headA=headA.next;
    		returnNum++;
    	}
    	return returnNum;
    }
}

