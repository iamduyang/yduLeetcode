/** 
 * 142. Linked List Cycle II
 */
public class Solution {

	 public ListNode detectCycle(ListNode head) {
    	if(head==null||head.next==null)
    		return null;
    	ListNode slowerRunner =head;
    	ListNode quickerRunner =head;
    	while(quickerRunner.next!=null&&quickerRunner.next.next!=null){
    		slowerRunner=slowerRunner.next;
    		quickerRunner=quickerRunner.next.next;
    		if(slowerRunner==quickerRunner){
    			
                    ListNode slow2 = head; 
                    while (slow2 != slowerRunner){
                    	slowerRunner = slowerRunner.next;
                        slow2 = slow2.next;
                    }
                    return slowerRunner;
               }
    				
    	}
	
		return null;
	}
}