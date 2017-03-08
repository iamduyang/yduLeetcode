/** 
 * 98. Validate Binary Search Tree
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
    	
    	return isValidBSTWithVal( root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBSTWithVal(TreeNode root,long min,long max) {
        if(root==null)
        	return true;
        boolean leftE=(root.left!=null);
        boolean rightE=(root.right!=null);
        if (root.val >= max || root.val <= min) 
        	return false;
        if(leftE&&rightE)
        	return (root.left.val<root.val)&&(root.right.val>root.val)&&isValidBSTWithVal(root.left,min,root.val)&&
        				isValidBSTWithVal(root.right,root.val,max);
        else if(!leftE&&rightE)
        	return (root.right.val>root.val)&&isValidBSTWithVal(root.right,root.val,max);
        else if(leftE&&!rightE)
        	return (root.left.val<root.val)&&isValidBSTWithVal(root.left,min,root.val);
        else
        	return true;
        
    }
}
