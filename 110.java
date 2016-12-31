public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        else if(Math.abs(depthLeftRight(root.left)-depthLeftRight(root.right))>1)
            return false;
        else if(!isBalanced(root.left)||!isBalanced(root.right))
            return false;
        else 
            return true;  
        
    }
    public int depthLeftRight(TreeNode root) {
        if(root==null)
            return 0;
        int depthRight = depthLeftRight(root.left);
        int depthLeft = depthLeftRight(root.right);
        int lengthBig =(depthRight>depthLeft)?depthRight:depthLeft;
        return lengthBig+1; 
      
     }
    
}