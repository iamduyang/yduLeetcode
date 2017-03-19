/**
 *  75. Sort Colors
 * */

public class Solution {
    public void sortColors(int[] nums) {
       int numsLen=nums.length;
       if(numsLen<2)
    	   return ;
       int[] numsC ={0,0,0};

       for(int i=0;i<numsLen;i++)
    	  
    	   numsC[nums[i]]++;
       
       for(int i=0;i<numsC[0];i++)
    	   nums[i]=0;
       for(int i=numsC[0];i<numsC[1]+numsC[0];i++)
    	   nums[i]=1;
       for(int i=numsC[1]+numsC[0];i<numsLen;i++)
    	   nums[i]=2;
    }
}