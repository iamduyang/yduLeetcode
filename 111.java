public class Solution {
	public int minDepth(TreeNode root) {
	    if(root==null)
	    	return 0;
	    int depthRight = minDepth(root.left);
	    int depthLeft = minDepth(root.right);
	    if(depthRight!=0&&depthLeft!=0)
	    	return (depthRight<depthLeft)?(depthRight+1):(depthLeft+1);
	    else 
	    	return 1+depthRight+depthLeft;
	    }

}

    