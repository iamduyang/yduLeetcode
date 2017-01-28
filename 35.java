
public class Solution {
    public int searchInsert(int[] nums, int target) {
    	int numsLength = nums.length;
    	if (numsLength==0)
    		return 0;
    			
        return findIndex(nums,0,numsLength-1,target);
    }
    public int findIndex(int[] nums, int beginIndex, int endIndex,int target) {
    	if(beginIndex==endIndex){
    		if(nums[beginIndex]>=target)
    			return beginIndex;
    		else 
    			return beginIndex+1;
    		 
    	}
        int medIndex = (beginIndex+endIndex)/2;
        
        if(nums[medIndex]==target)
        	return medIndex;
        else  if(nums[medIndex]>target){
        	if(medIndex==0)
        		return 0;
        	return findIndex(nums,0,medIndex-1,target);
        }
        else {
        	if(medIndex==nums.length-1)
        		return nums.length;
        	return findIndex(nums,medIndex+1,endIndex,target);
        	
        }
        
    }
}