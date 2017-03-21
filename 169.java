/**
 * 169. Majority Element
 * */
public class Solution {
    public int majorityElement(int[] nums) {
        int numsLength = nums.length;
        int logicExistence =1,returnNum = nums[0];
        for(int i=1;i<numsLength;i++){
        	if(logicExistence==0){
        		returnNum=nums[i];
        		logicExistence=1;
        	}
        	else{
        		if( nums[i]!=returnNum)
        			logicExistence--;
        		else
        			logicExistence++;
        			
        		
        	}
        }
        return returnNum;
        
    }
}
