public class Solution {
    public int climbStairs(int n) {
    	 int one = 0;  
         int two = 1;  
         int total = 0;  
           
         for(int i = 0;i<n;i++)  {  
        	 total = one + two;  
             one = two;  
             two = total;                        
         }       
         return total;  
    }
}