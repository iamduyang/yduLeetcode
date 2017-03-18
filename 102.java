/** 
 * 102. Binary Tree Level Order Traversal
 */

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> returnList=new ArrayList<List<Integer>>();
    	if(root==null)
    		return returnList;
    	ArrayDeque<TreeNode> treeNodeQuene=new ArrayDeque<TreeNode>();
    	TreeNode flagNode =new TreeNode(-1);
    	treeNodeQuene.add(root);
    	treeNodeQuene.add(flagNode);
    	while(!treeNodeQuene.isEmpty()){
    		TreeNode curNode =treeNodeQuene.poll();
    		if(curNode==flagNode)
    			continue;
    		List<Integer> thisIntList = new ArrayList<Integer>();
    		while(curNode!=flagNode){
    			thisIntList.add(curNode.val);
    			if(curNode.left!=null)
    				treeNodeQuene.add(curNode.left);
    			if(curNode.right!=null)
    				treeNodeQuene.add(curNode.right);
    			curNode =treeNodeQuene.poll();
    		}
    		if(!thisIntList.isEmpty())
    			returnList.add(thisIntList);
    		treeNodeQuene.add(flagNode);
    		
    	}
    	
    	
    	return returnList;
    	
    }
}