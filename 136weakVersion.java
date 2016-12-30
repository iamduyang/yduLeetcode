import java.util.HashSet;
public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hh1 = new HashSet<Integer>();
        HashSet<Integer> hh2 = new HashSet<Integer>();
       
        for(int i=0;i<nums.length;i++){
             hh1.add(nums[i]);  
             hh2.add(nums[i]);  
             
        }
        for(int i=0;i<nums.length;i++){
            if(hh1.contains(nums[i])){
            	hh1.remove(nums[i]);
            }
            else
            	hh2.remove(nums[i]);
       }
        int returnNumAction =0;
        for(int returnNum:hh2)
        	returnNumAction =returnNum;
        	
        
        return returnNumAction;
    }
}