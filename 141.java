/** 
 * 141. Linked List Cycle
 */
public class Solution {
public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        ListNode slowerRunner =head;
        ListNode quickerRunner =head;
        while(quickerRunner.next!=null&&quickerRunner.next.next!=null){
            slowerRunner=slowerRunner.next;
            quickerRunner=quickerRunner.next.next;
            if(slowerRunner==quickerRunner)
                return true;
                    
        }
    
        return false;
    }
}