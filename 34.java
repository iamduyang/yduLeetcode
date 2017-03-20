/**
 * 34. Search for a Range
 * */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int[] returnInt ={-1,-1};
    	
    	int numsLength= nums.length;
    	if(numsLength==0)
    		return returnInt;
    	int seedIndex=findSearchSeed(nums,target);
    	System.out.println("seedIndex: "+seedIndex);
    	if(seedIndex==-1)
    		return returnInt;
    		
    	returnInt[0]=leftMost(nums,target,seedIndex);
    	
    	returnInt[1]=rightMost(nums,target,seedIndex);
    	
        return returnInt;
    }
    
    public  int leftMost(int[] nums, int target,int middle){
    	int candidate =middle/2;
    	int leftBound=0;
    	while(leftBound!=middle){
    	 if(nums[candidate]==target){
    		 middle=candidate;
    		 candidate=leftBound+(middle-leftBound)/2;
    	 }
    	 else{
    		 leftBound=candidate+1;
    		 candidate=leftBound+(middle-leftBound)/2;
    	 }
    	 
    	 
    	}
    	return leftBound;
    }
    
    public  int rightMost(int[] nums, int target,int middle) {
    	int righitBound = nums.length;
    	int candidate=middle+(righitBound-middle)/2;
    	while(middle!=(righitBound-1)){
    		 if(nums[candidate]==target){
        		 middle=candidate;
        		 candidate=middle+(righitBound-middle)/2;
        	 }
    		 else{
    			 righitBound=candidate;
    			 candidate=middle+(righitBound-middle)/2;
    		 }
    	}
    	return middle;
    }
    
    
    public  int findSearchSeed(int[] nums, int target) {
    	int beginIndex =0,endIndex=nums.length;
    	while(beginIndex<endIndex){
    		int middle=beginIndex+(endIndex-beginIndex)/2;
    		if(nums[middle]==target)
    			return middle;
    		else if(nums[middle]>target){
    			endIndex=middle;
    		}
    		else{
    			beginIndex=middle+1;
    		}
    	}

    	return -1;
    }
}


