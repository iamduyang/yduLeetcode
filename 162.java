/** 
 * 162. Find Peak Element
 */

public class Solution {
    public int findPeakElement(int[] nums) {
        int numsLen = nums.length;
        if(numsLen==1||nums[0]>nums[1])
        	return 0;
        if(nums[numsLen-1]>nums[numsLen-2])
        	return numsLen-1;
        for(int i=1;i<numsLen-1;i++){
        	if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])
        		return i;
        	
        }
        	
        	
        return -1;
    }
}

