public class Solution {
    public int removeElement(int[] nums, int val) {
        int countIt = 0;
        int numsLength = nums.length;
        for(int i=0;i<numsLength;i++){
        	if(nums[i]==val){
        		countIt++;
        		continue;
        	}
        	if(countIt>0)
        		nums[i-countIt] = nums[i];
        	
        }
        return numsLength-countIt;
    }
}