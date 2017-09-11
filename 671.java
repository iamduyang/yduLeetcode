/** 
 * 671. Second Minimum Node In a Binary Tree
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null||root.left==null)
        	return -1;
        int[] twoInt = findTwoMinimumValue(root);
        if(twoInt[0]==-1)
        	return -1;
        else
        	return twoInt[1];
        
    }
    public int[] findTwoMinimumValue(TreeNode root) {
    	int[] returnInt ={-1,root.val};
        if(root.left==null)
        	return returnInt;
        int[] leftArray = findTwoMinimumValue(root.left),
        		rightArrary = findTwoMinimumValue(root.right);
        HashSet<Integer> allSet = new HashSet<Integer>();
        allSet.add(root.val);allSet.add(leftArray[0]);allSet.add(leftArray[1]);
        allSet.add(rightArrary[0]);allSet.add(rightArrary[1]);
        
        
        Integer[] compareArray = allSet.toArray(new Integer[] {});
        Arrays.sort(compareArray);
        if(compareArray.length==2){
        	returnInt[0]=compareArray[0];
        	returnInt[1]=compareArray[1];
        }
        else if(compareArray[0]==-1){
        	returnInt[0]=compareArray[1];
        	returnInt[1]=compareArray[2];
        }
        else{
        	returnInt[0]=compareArray[0];
        	returnInt[1]=compareArray[1];
        }
        return returnInt;
        	
        
    }
    
    
}