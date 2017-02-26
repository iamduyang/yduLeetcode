/** 
 *   485. Max Consecutive Ones
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int returnInt = 0;
        int tempCount = 0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==1)
        		tempCount++;
        	else{
        		if(tempCount>returnInt)
        			returnInt = tempCount;
        		tempCount=0;
        	}
        }
		if(tempCount>returnInt)
			returnInt = tempCount;

        
        return returnInt;
    }
}