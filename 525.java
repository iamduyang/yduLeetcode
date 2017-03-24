/** 
 * 525. Contiguous Array
 */
public class Solution {
    public int findMaxLength(int[] nums) {
        int numsLength = nums.length;
        if(numsLength<1)
            return numsLength;
        
        for(int i=0;i<numsLength;i++){
            if(nums[i]==0)
                nums[i]=-1;
        }
        Map<Integer,Integer> numsMap = new  HashMap<Integer,Integer>();
        int curSum=0, returnMax=0;
        numsMap.put(0, -1);
        for(int i=0;i<numsLength;i++){
            curSum+=nums[i];
            if(numsMap.containsKey(curSum)){
                returnMax=Math.max(returnMax, i-numsMap.get(curSum));
            }
            else{
                numsMap.put(curSum,i);
            }
        }
        
        return returnMax;
    } 
}