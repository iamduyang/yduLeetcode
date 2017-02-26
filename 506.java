/** 
 *  506. Relative Ranks
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int numsLength = nums.length;
        String[] returnString = new  String[numsLength];
        int[][] rankNums = new  int[numsLength][2];
        for(int i=0;i<numsLength;i++){
        	rankNums[i][0] = nums[i];
        	rankNums[i][1] = i;
        }
        int tempInt =0;
        for(int i=numsLength-1; i>0;i--)
        	for(int j=0;j<i;j++)
        		if(rankNums[j][0]<rankNums[j+1][0]){
        			tempInt=rankNums[j][0];
        			rankNums[j][0] =rankNums[j+1][0];
        			rankNums[j+1][0]=tempInt;
        			tempInt=rankNums[j][1];
        			rankNums[j][1] =rankNums[j+1][1];
        			rankNums[j+1][1]=tempInt;
        		}
        
        for(int i=0;i<3&&i<numsLength;i++){
        	if(i==0)
        		returnString[rankNums[i][1]]="Gold Medal";
        	if(i==1)
        		returnString[rankNums[i][1]]="Silver Medal";
        	if(i==2)
        		returnString[rankNums[i][1]]="Bronze Medal";
        }
        for(int i=3;i<numsLength;i++){
        	returnString[rankNums[i][1]]=""+(i+1);
        }
        		
        	
        return returnString;
    }
}