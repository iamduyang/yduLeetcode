
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null)&&(q==null))
            return true;
        else if(q==null&&p!=null)
            return false;
        else if(p==null&&q!=null)
            return false;
            
        else if((p.left==null)&&(q.left==null)&&(p.right==null)&&(q.right==null)&&(p.val==q.val))
    		return true;
    	else if((p.left==null)&&(q.left==null)&&(p.right!=null)&&(q.right!=null)&&(p.val==q.val))
    		return isSameTree(p.right,q.right);
    	else if((p.left!=null)&&(q.left!=null)&&(p.right==null)&&(q.right==null)&&(p.val==q.val))
    		return isSameTree(p.left,q.left);
    	else if((p.left!=null)&&(q.left!=null)&&(p.right!=null)&&(q.right!=null)&&(p.val==q.val))
    		return isSameTree(p.right,q.right)&&isSameTree(p.left,q.left);
    	else
    		return false;
        
    }
}