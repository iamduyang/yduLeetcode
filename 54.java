/** 
 * 54. Spiral Matrix
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> returnList =new ArrayList<Integer>();
    	int matA=matrix.length;
    	if(matA==0)
    		return returnList;
    	int matB=matrix[0].length;
    	
    	int rightBorder=0,leftBorder=matB-1,upBorder= 0,downBorder=matA-1;
    	
    	while(!(rightBorder>leftBorder||upBorder>downBorder)){
    		for(int i=rightBorder;i<leftBorder+1;i++)
    			returnList.add(matrix[upBorder][i]);
    		upBorder++;	
    		if(upBorder>downBorder)
    			break;
    		for(int i=upBorder;i<downBorder+1;i++)
    			returnList.add(matrix[i][leftBorder]);
    		leftBorder--;
    		if(rightBorder>leftBorder)
    			break;
    		for(int i=leftBorder;i>=rightBorder;i--)
    			returnList.add(matrix[downBorder][i]);
    		downBorder--;
    		if(upBorder>downBorder)
    			break;
    		for(int i=downBorder;i>=upBorder;i--)
    			returnList.add(matrix[i][rightBorder]);
    		rightBorder++;	
    	}
    	
    	
    	return returnList;
    }
}
