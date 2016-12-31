public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        	return 0;
        else
        	return 1+maxDepthLeftRight( root.left,root.right);
    }
    public int maxDepthLeftRight(TreeNode leftT,TreeNode rightT) {
    int depthLeft =maxDepth(leftT);
    int depthRight =maxDepth(rightT);
    
       return (depthLeft>depthRight)?depthLeft:depthRight;
    }
}