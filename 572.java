/*
* 572. Subtree of Another Tree
*/
class Solution {
    public boolean isSubtree(TreeNode s,TreeNode t) {
        if(s==null||t==null)
        	return false;
        if(chechpartTree(s,t))
        	return true;
        
        return isSubtree(s.left,t)||isSubtree(s.right,t);
        	
    }
    public boolean chechpartTree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null)
        	return false;
        if(root2.val!=root1.val)
        	return false;
        if(root2.left!=null)
        	if(!chechpartTree(root1.left,root2.left))
        		return false;
        if(root2.right!=null)
        	if(!chechpartTree(root1.right,root2.right))
        		return false;
        
        return true;
        	
    }
}

