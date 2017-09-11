/** 
 * 633. Sum of Square Numbers
 */
class Solution {
    public boolean judgeSquareSum(int c) {
    	int halfC = c/2;
    	int maxInt =(int)Math.sqrt(halfC)+1;
    	for(int i=0;i<maxInt;i++){
    		if(isSquare(c-i*i))
    			return true;
    	}
    	return false;
        
    }
    
    boolean isSquare(int num){
    	int num2  =(int)Math.sqrt(num);
    	if(num2*num2==num)
    		return true;
    	else 
    		return false;
    }
}