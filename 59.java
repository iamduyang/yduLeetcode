
/** 
 * 59. Spiral Matrix II
 */
public class Solution {
	 public int[][] generateMatrix(int n) {
		
    	
    	int[][] matrix=new int[n][n];
    	
    	int rightBorder=0,leftBorder=n-1,upBorder= 0,downBorder=n-1;
    	int count=1;
    	while(!(rightBorder>leftBorder||upBorder>downBorder)){
    		for(int i=rightBorder;i<leftBorder+1;i++){
    			matrix[upBorder][i]=count;
    			count++;
    		}
    			
    		upBorder++;	
    		 
    		for(int i=upBorder;i<downBorder+1;i++){
    			matrix[i][leftBorder]=count;
    			count++;
    		}
    		leftBorder--;
    		 
    		for(int i=leftBorder;i>=rightBorder;i--){
    			matrix[downBorder][i]=count;
    			count++;
    		}
    		downBorder--;
    		 
    		for(int i=downBorder;i>=upBorder;i--){
    			matrix[i][rightBorder]=count;
    			count++;
    		}
    		rightBorder++;	
    	}
    	
    	
    	return matrix;
    }
}
