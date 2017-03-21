/**
 * 189. Rotate Array
 * */
public class Solution {
	int temp;
    public void rotate(int[] nums, int k) {
        int numsLen =nums.length;
        k %= numsLen;
        if(numsLen==0||k==0)
        	return ;
        reverseInTheArray(nums,0,numsLen-1);
        reverseInTheArray(nums,0,k-1);
        reverseInTheArray(nums,k,numsLen-1);
    }
    public void reverseInTheArray(int[] nums, int begin, int end){
    	while(begin<end){
    		temp=nums[begin];
    		nums[begin]=nums[end];
    		nums[end]=temp;
    		begin++;
    		end--;
    	}
    }
}