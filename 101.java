 public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        else 
            return isSymmetricOutSide(root.right,root.left);
    }
    public boolean isSymmetricOutSide(TreeNode right,TreeNode left) {
        if(right==null&&left==null)
            return true;
        else  if(right==null||left==null)
            return false;
        else if(right.val!=left.val)
            return false;
        else    
            return isSymmetricOutSide(right.right,left.left)&&isSymmetricOutSide(right.left,left.right);
    }

}