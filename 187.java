/** 
 * 187. Repeated DNA Sequences
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    	  	Set seen = new HashSet(), repeated = new HashSet();
    	    for (int i = 0; i + 9 < s.length(); i++) {
    	        String nowString = s.substring(i, i + 10);
    	        if (!seen.add(nowString))
    	            repeated.add(nowString);
    	    }
    	    return new ArrayList(repeated);
    }
}

