/** 
 *  219. Contains Duplicate II
 * Given an array of integers and an integer k, find out whether there are two distinct 
 * 		indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    
        int numsLength = nums.length;
        if(numsLength<2)
        	return false;
        if(numsLength<=k+1)
        	return containDuplicateLocal(nums,0,numsLength-1);
        if(containDuplicateLocal(nums,0,k))
        	return true;
        for(int i=k+1;i<numsLength;i++)
        	for(int j=i-k;j<i;j++)
        		if(nums[i]==nums[j])
    				return true;
        
        return false;
    }
    
    public boolean containDuplicateLocal(int[] nums, int beginI, int endI) {
    	int []  newData = Arrays.copyOfRange(nums, beginI, endI+1);
    	Arrays.sort(newData);
    	for(int i=0;i<newData.length-1;i++)
    			if(newData[i]==newData[i+1])
    				return true;
    	return false;
    }
    
}