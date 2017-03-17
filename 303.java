/**
*303. Range Sum Query - Immutable
*/
public class NumArray {
	private int[] sumOfZeroT0Now;
    public NumArray(int[] nums) {
        int numsLen=nums.length;
        if(numsLen!=0){
	        sumOfZeroT0Now = new int[numsLen];
	        sumOfZeroT0Now[0]=nums[0];
	        for(int i=1;i<numsLen;i++)
	        	 sumOfZeroT0Now[i]= sumOfZeroT0Now[i-1]+nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return (i==0)?sumOfZeroT0Now[j]:(sumOfZeroT0Now[j]-sumOfZeroT0Now[i-1]);
    }
}

