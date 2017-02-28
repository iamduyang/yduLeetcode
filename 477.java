/** 
 * 477. Total Hamming Distance
 */
public class Solution {
    public int totalHammingDistance(int[] nums) {
    	 int returnInt = 0;
    	 int numsLength = nums.length;
    	 boolean[] notZeroFlag =new  boolean[numsLength];
    	 int countOne =0;
    	 int countZero = 0;
    	 int countNoneZero = 0;
    	 for(int i=0;i<numsLength;i++)
    		if(nums[i]>0){
    			notZeroFlag[i]=true;
    			countNoneZero++;
    		}
    		else
    			notZeroFlag[i]=false;
    
    	 while(countNoneZero>0){
    		
    		 for(int i=0;i<numsLength;i++){
    			 if(!notZeroFlag[i])
    				 continue;
    			 if(nums[i]%2==1)
    				 countOne++;
    			 nums[i]/=2;
    			 if(nums[i]==0){
    				 notZeroFlag[i]=false;
    				 countNoneZero--;
    			 }
    				 
    		 }
    		 countZero=numsLength-countOne;
    		 returnInt+=countZero*countOne;
    		 countOne=0;
    	 }
    			
    		 
    	 return returnInt;
    }

}