import java.util.HashSet;
public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hh1 = new HashSet<Integer>();
  
       
        for(int i=0;i<nums.length;i++){
             if(hh1.contains(nums[i])){
                hh1.remove(nums[i]);
             }
             else
                 hh1.add(nums[i]);  
            
             
        }
      
        int returnNumAction =0;
        for(int returnNum:hh1)
            returnNumAction =returnNum;
            
        return returnNumAction;
    }
}