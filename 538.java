/**
 *   538. Convert BST to Greater Tree
 * */
class Solution {
	int count=0;
    public TreeNode convertBST(TreeNode root) {
       if(root==null)
    	   return null;
       convertBST(root.right);
       count+=root.val;
       root.val=count;
       convertBST(root.left);
       return root;
    }

}
