public class Solution {
	public void deleteNode(ListNode node) {
		ListNode n1 = null;
		n1 = node.next;
		node.val = n1.val;
		node.next = n1.next;

	}
}