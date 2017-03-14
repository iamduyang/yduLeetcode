/** 
 * 532. K-diff Pairs in an Array
 */

public class Solution {
    public int findPairs(int[] nums, int k) {
        int numsLength = nums.length;
    	if(numsLength<2)
        	return 0;
        
        Arrays.sort(nums);
        Set<Integer> setNums = new HashSet<Integer>();
        
        for(int i=0;i<numsLength;i++)
        	setNums.add(nums[i]);
        int accuallyNums = setNums.size();
        int[][] newNumbers = new int[accuallyNums][2];
        
        int countNums=0;
        for(int i=0;i<accuallyNums;i++){
        	newNumbers[i][0]=nums[countNums];
        	newNumbers[i][1]=1;
        	while((countNums<numsLength-1)&&nums[countNums]==nums[countNums+1]){
        		countNums++;
        		newNumbers[i][1]++;
        	}
        	countNums++;
        	
        }
        
        int returnNum = 0;
        if(k==0){
        	 for(int i=0;i<accuallyNums;i++){
        		 if(newNumbers[i][1]>1)
        			 returnNum++; 
        	 }
        	 
        	 return returnNum;
        }
        	
       
      
        for(int i=0;i<accuallyNums;i++){
        	for(int j=i+1;j<accuallyNums;j++){
        		int plusK = newNumbers[i][0]+k;
        		if(newNumbers[j][0]>plusK)
        			break;
        		if(newNumbers[j][0]==plusK){
        			
        			returnNum ++;
        			//returnNum += newNumbers[j][1]*newNumbers[i][1];
        			break;
        		}
        		
        	}
        }
        
        return returnNum;
        
        
    }
}



