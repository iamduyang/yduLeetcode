
/** 
 * 53. Maximum Subarray
 *  *****copy of the best answer
 *  ***** the logic behind the answer is very good
 */
public class Solution {
    public int maxSubArray(int[] nums) {
    	
    	    int maxSoFar=nums[0], maxEndingHere=nums[0];
    	    for (int i=1;i<nums.length;++i){
    	    	maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
    	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
    	    }
    	    return maxSoFar;
    	}
    
}