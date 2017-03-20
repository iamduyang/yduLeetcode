
/**
 *  77. Combinations
 *  
 *  "Your runtime beats 83.93% of java submissions."
 * */

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        return combineBeginEnd(k,1,n);
    }
    public List<List<Integer>> combineBeginEnd(int k, int begin,int end) {
    	 List<List<Integer>> returnList =new ArrayList<List<Integer>>();
    	if(k==0)
    		return returnList;
    	if(k==1){
        	for(int i=begin;i<end+1;i++){
        		List<Integer> intList =new ArrayList<Integer>();
        		intList.add(i);
        		returnList.add(intList);
        	}
        	return returnList;
        }
    	else{
    		for(int i=begin;i<end-k+2;i++){
    			
    			List<List<Integer>> kMinusOneList=combineBeginEnd(k-1,i+1,end);
    			for(List<Integer> aa:kMinusOneList){
    				List<Integer> intList =new ArrayList<Integer>();
            		intList.add(i);
            		intList.addAll(aa);
            		returnList.add(intList);
    			}
    		
    			 
    		}
    		
		
    		return returnList;
    	}
        	
    }
    
}



