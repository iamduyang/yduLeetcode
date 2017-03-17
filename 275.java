/** 
 *	275. H-Index II
 */

public class Solution {
    public int hIndex(int[] citations) {
    	int lenCitations = citations.length;
    	if(lenCitations<1)
    		return 0;
        
        for(int i=0;i<lenCitations;i++){
        	if(citations[i]>=(lenCitations-i))
        		return (lenCitations-i);
        }
        return 0;
    }
}
