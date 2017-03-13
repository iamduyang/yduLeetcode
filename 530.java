
/** 
 * 530. Minimum Absolute Difference in BST
 */
public class Solution {
    public int getMinimumDifference(TreeNode root) {
    	List<Integer> allInt =getAllInt(root);
    	Collections.sort(allInt);
    	int returnInt= Math.abs(allInt.get(0)-allInt.get(1));
    	int listSizeMinusOne = allInt.size()-1;
    	int tempDiff=0;
    	for(int i=1;i<listSizeMinusOne;i++){
    		tempDiff = Math.abs(allInt.get(i)-allInt.get(i+1));
    		if(tempDiff<returnInt)
    			returnInt=tempDiff;
    	}
    	
    	return returnInt;
    }
    
    
    
    public List<Integer> getAllInt(TreeNode root) {
    	List<Integer> returnList =new ArrayList<Integer>();
    	if(root==null)
    		return returnList;
    	returnList.add(root.val);
    	returnList.addAll(getAllInt(root.left));
    	returnList.addAll(getAllInt(root.right));
    	return returnList;
    
    }
    
    
}




