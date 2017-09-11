/** 
 * 645. Set Mismatch
 */

class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] returnArray  = new int[2];//{doubleTime,mis};
        for(int i:nums){
        	if(nums[Math.abs(i)-1]>0)
        		nums[Math.abs(i)-1] *= (-1);
        	else{
        		returnArray[0]=Math.abs(i);
        	}
        		
        }
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>0){
        		returnArray[1]=i+1;
        		break;
        	}
        		
        }
        
         
        
        
        
        
        return returnArray;
        
    }
}