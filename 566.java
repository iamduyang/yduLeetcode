/**
 *   566. Reshape the Matrix
 * */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int len1=nums.length;
        if(len1<1)
        	return nums;
        int len2=nums[0].length;
        if(r<1||c<1||r*c!=len1*len2)
        	return nums;
        int[][] returnArray = new int[r][c]; 
        int rowInOri,colInOri,rowInNew,colInNew;
        for(int i=0;i<r*c;i++){
        	rowInOri=i/len2;
        	colInOri=i%len2;
        	rowInNew=i/c;
        	colInNew=i%c;
        	returnArray[rowInNew][colInNew]=nums[rowInOri][colInOri];
        }
        return returnArray;
    }
}

