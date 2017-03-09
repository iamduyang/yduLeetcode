/** 
 * 109. Convert Sorted List to Binary Search Tree
 */
public class Solution {
	
	 public TreeNode sortedListToBST(ListNode head) {
		 if(head==null)
	        	return null;
		 if(head.next==null)
			 return new TreeNode(head.val);

		 ListNode slowHead=head;
		 ListNode quickHead=head;
		 ListNode slowHeadAhead=null;
		 while(quickHead.next!=null&&quickHead.next.next!=null){
			 quickHead=quickHead.next.next;
			 slowHeadAhead=slowHead;
			 slowHead=slowHead.next;
		 }
		 
		 TreeNode thisTreenode =new TreeNode(slowHead.val);
		 thisTreenode.right=sortedListToBST(slowHead.next);
		 if(slowHeadAhead!=null){
			 slowHeadAhead.next=null;
			 thisTreenode.left=sortedListToBST(head);
		 }
		 
		 return thisTreenode;
	 }

    
}