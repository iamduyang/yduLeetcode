/** 
 * 674. Longest Continuous Increasing Subsequence
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {
    	int len =nums.length;
    	if(len<2)
    		return len;
    	if(nums[1]>nums[0])
    		nums[0] =2;
    	else
    		nums[0]=1;
        for(int i=2;i<len;i++){
        	if(nums[i]>nums[i-1])
        		nums[i-1] = nums[i-2]+1;
        	else
        		nums[i-1] = 1;
        }
        nums[len-1]=1;
        int max = nums[0];
        for(int i=1;i<len;i++){
        	if(nums[i]>max)
        		max = nums[i];
        }
        return max;
    }
}
