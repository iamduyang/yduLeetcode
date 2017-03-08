/** 
 * 55. Jump Game
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int numsLength =nums.length;
        int i=numsLength-1;
       while(i>0){
    	   int temp=i-1;
    	   for(;temp>=0;temp--){
    		   if(nums[temp]+temp>=i){
    			   i=temp;
    			   break;
    		   }
    		   if(temp==0&&i>0)
        		   return false;
    		   
    	   }
    	   
       }
       return true;
    }
    
   
}