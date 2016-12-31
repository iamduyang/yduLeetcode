public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
       if(root==null)
    	   return false;
       if(root.right==null&&root.left==null&&root.val==sum)
    	   return true;
       else
    	   return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
