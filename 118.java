/** 
 * 118. Pascal's Triangle
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	 List<List<Integer>> returnList =new ArrayList<List<Integer>>();
    	 if(numRows<1)
    		 return returnList;
    	 List<Integer> preList = new ArrayList<Integer>();
    	 preList.add(1);
    	 returnList.add(preList);
    	 for(int i=1;i<numRows;i++){
    		List<Integer> nextList = new ArrayList<Integer>();
    		nextList.add(1);
    		preList=returnList.get(returnList.size()-1);
    		for(int j=0;j<preList.size()-1;j++)
    			nextList.add(preList.get(j)+preList.get(j+1));
    		
    		nextList.add(1);
    		returnList.add(nextList);
    	 }
    	
    	 
    	 return returnList;
    }
}
