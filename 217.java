public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	HashSet hashset =new HashSet();
    	for(int ii:nums)
    		if( hashset.contains(ii))
    			return true;
    		else
    			hashset.add(ii);  		
    	return false;
        
    }
}