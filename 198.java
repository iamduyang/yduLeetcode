/** 
 * 198. House Robber
 */
public class Solution {
    public int rob(int[] nums) {
       int numsLen = nums.length;

       int evenMax=0,oddMax =0;
       for(int i=0;i<numsLen;i++){
    	   if(i%2==0){
    		   evenMax=Math.max(evenMax+nums[i], oddMax);
    	   }
    	   else{
    		   oddMax=Math.max(oddMax+nums[i], evenMax);
    	   }
       }
       return Math.max(oddMax, evenMax);
    }
}

