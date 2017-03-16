/** 
 * 26. Remove Duplicates from Sorted Array
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int numsLen = nums.length;
        if(numsLen<2)
        	return numsLen;
        int count1=0,countAll=0;
    	while(countAll<numsLen){
    		int i=1;
    		while(countAll+i<numsLen&&nums[countAll]==nums[countAll+i]){
    			
    			i++;
    		}
    		countAll=countAll+i-1;
    	
    		nums[count1]=nums[countAll];
    		count1++;
    		countAll++;
    		
    	}
    	return count1;
    }
}
