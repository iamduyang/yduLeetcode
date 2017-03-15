/** 
 * 268. Missing Number
 */
public class Solution {
	public int missingNumber(int[] nums) {

	    int tempStore = 0, i = 0;
		for (; i < nums.length; i++) {
			tempStore = tempStore ^ i ^ nums[i];
		}

		return tempStore ^ i;
	}
}