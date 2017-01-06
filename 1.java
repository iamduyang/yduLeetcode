public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnInt =new int[2];
    	for(int ii=0;ii<nums.length;ii++)
    		for(int jj=ii+1;jj<nums.length;jj++){
    			if((nums[ii]+nums[jj])==target){
    				returnInt[0]=ii;
    				returnInt[1]=jj;
    				return returnInt;
    			}
    		}
    	return returnInt;
    			
    }
}