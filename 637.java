/** 
 *  637. Average of Levels in Binary Tree
 */
import java.lang.Math;
import java.math.BigDecimal;
import java.math.BigInteger;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    	List<Double> returnList = new ArrayList<Double> ();
        List<List<BigInteger>> sumList  = getLevelsSum(root);
        for(int i=0;i<sumList.size();i++){
        	BigDecimal temp1 = new BigDecimal(sumList.get(i).get(0));
        	BigDecimal temp2 = new BigDecimal(sumList.get(i).get(1));
        	temp1 = temp1.divide(temp2,6,BigDecimal.ROUND_HALF_EVEN);
        	returnList.add(temp1.doubleValue());
        			
        	
        }
        return returnList;
    }
    
    List<List<BigInteger>> getLevelsSum(TreeNode root){
    	 List<List<BigInteger>> returnList = new ArrayList<List<BigInteger>>();
    	 if(root==null)
    		 return returnList;
    	 List<BigInteger> inList =new ArrayList<BigInteger>();
    	 inList.add(BigInteger.valueOf(root.val));inList.add(new BigInteger("1"));
    	 returnList.add(inList);
        if(root.left==null&&root.right==null)
        	return returnList;
        else{
        	List<List<BigInteger>> leftList = getLevelsSum(root.left);
        	List<List<BigInteger>> rightList = getLevelsSum(root.right);
        	int leftLen = leftList.size(),rightLen = rightList.size();
        	int minLen = Math.min(leftLen, rightLen);
        	for(int i=0;i<minLen;i++){
        		 List<BigInteger> tempList =new ArrayList<BigInteger>();
        		 tempList.add(leftList.get(i).get(0).add(rightList.get(i).get(0)));
        		 tempList.add(leftList.get(i).get(1).add(rightList.get(i).get(1)));
        		 returnList.add(tempList);
        		 
        	}
        	if(leftLen>minLen){
        		for(int i=minLen;i<leftLen;i++)
        			
        			returnList.add(leftList.get(i));
        		
        	}
        	else{
        		for(int i=minLen;i<rightLen;i++)
        			returnList.add(rightList.get(i));
        	}
        	
        	
        	
        	
        	return returnList;
        }
        	
    }
    
    
}

