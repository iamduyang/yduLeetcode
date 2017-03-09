
/** 
 * 108. Convert Sorted Array to Binary Search Tree
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int numsLen = nums.length;
        if(numsLen==0)
        	return null;
        return sortedArrayToBSTwithLimit(nums,0,numsLen-1);
        
    }
    
    
    public TreeNode sortedArrayToBSTwithLimit(int[] nums,int beginNum,int endNum) {
        int numsLen =endNum-beginNum+1;
        if(numsLen==1)
        	return new TreeNode(nums[endNum]);
        int middle=(endNum+beginNum)/2;
        TreeNode thisTree = new TreeNode(nums[middle]);
        if(middle>beginNum)
        	thisTree.left=sortedArrayToBSTwithLimit(nums,beginNum,middle-1);
        if(middle<endNum)
        	thisTree.right=sortedArrayToBSTwithLimit(nums,middle+1,endNum);
            
        return thisTree;
    }
}