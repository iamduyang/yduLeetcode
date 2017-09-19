/**
 *   414. Third Maximum Number
 * */

import java.util.HashSet;

class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        		
        int i=0;
        HashSet<Integer> numSet=new HashSet<Integer> ();
        for(;i<len;i++){
        	numSet.add(nums[i]);
        	if(numSet.size()>2)
        		break;
        }
        
        Integer[] temp = numSet.toArray(new Integer[] {});
        if(i==len){
        	if(temp.length==1)
        		return temp[0];
        	else if(temp.length==2)
        		return Math.max(temp[0], temp[1]);
        	return Math.min(Math.min(temp[0], temp[1]),temp[2]);	
        }
        int max1, max2, max3;
        max3 = Math.min(Math.min(temp[0], temp[1]),temp[2]);
        max1 = Math.max(Math.max(temp[0], temp[1]),temp[2]);
        max2=max1;
        for(int j=0;j<3;j++){
        	if(temp[j]!=max3&&temp[j]!=max1)
        		max2=temp[j];
        }
   
        for(;i<len;i++){
        	if(nums[i]<=max3||nums[i]==max1||nums[i]==max2)
        		continue;
        	else if(nums[i]>max1){
        		
        		max3=max2;max2=max1;max1=nums[i];
        	}
        	else if(nums[i]<max1&&nums[i]>max2){
        		
        		max3 = max2;
        		max2 = nums[i];
        	}
        	else{
        		
        		max3 = nums[i];
        	}
        		
        }
        return max3;
        
        
        
    }
    
    
}
