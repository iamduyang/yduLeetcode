/** 
 * 107. Binary Tree Level Order Traversal II
 */

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
    	int listSize = returnList.size();
    	List<List<Integer>> newReturnList=new ArrayList<List<Integer>>(listSize);
    	for(int i=listSize-1;i>=0;i--){
    		newReturnList.add(returnList.get(i));
    	}
    	return newReturnList;
    	
    }
}





