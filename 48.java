
/**
 * 48. Rotate Image
 * */

public class Solution {
    public void rotate(int[][] matrix) {
    	transposeTheMat(matrix);
    	verticalMove(matrix);
    }
    public void transposeTheMat(int[][] matrix) {
    	int len1=matrix.length;
    	for(int i=0;i<len1;i++)
    		for(int j=i;j<len1;j++){
    			int temp=matrix[i][j];
    			matrix[i][j]=matrix[j][i];
    			matrix[j][i]=temp;
    		}
    }
    public void verticalMove(int[][] matrix) {
    	int len1=matrix.length;
    	if(len1==0)
    		return ;
    	
    	for(int i=0;i<len1/2;i++){
    		for(int j=0;j<len1;j++){
    			int temp=matrix[j][i];
    			matrix[j][i]=matrix[j][len1-i-1];
    			matrix[j][len1-i-1]=temp;
    		}
    	}
    }
    
    
}
