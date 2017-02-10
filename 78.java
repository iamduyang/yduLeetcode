public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> returnList = new ArrayList<List<Integer>>();
    	int numslength = nums.length;
    	int power2 = (int) Math.pow(2,numslength);
    	
    	for(int i=0;i<power2;i++){
    		List<Integer> tempList = new ArrayList<Integer>();
    		String binaryString2 = Integer.toBinaryString(i);
    		int toGoNum = numslength-binaryString2.length();
    		for(int jj = 0;jj<binaryString2.length();jj++){
    			if(binaryString2.charAt(jj)=='1')
    				tempList.add(nums[jj+toGoNum]);
    		}
    		returnList.add(tempList);
    	}
    	
    	return returnList;
    }
}