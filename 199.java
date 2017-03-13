/** 
 * 199. Binary Tree Right Side View
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> returnList =new ArrayList<Integer>();
    	if(root==null)
    		return returnList;
    	
    	returnList.add(root.val);
    	List<Integer> leftList =rightSideView(root.left);
    	List<Integer> rightList =rightSideView(root.right);
    	int leftSize = leftList.size(), rightSize = rightList.size();
    	if(rightSize>=leftSize)
    		returnList.addAll(rightList);
    	else{
    		int i=rightSize;
    		returnList.addAll(rightList);
    		while(i<leftSize)
    			returnList.add(leftList.get(i++));  		
    	}
    	return returnList;   	
        	
    }
}
