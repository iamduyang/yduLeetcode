/*
 *3. Longest Substring Without Repeating Characters
 */
import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	
        HashSet<Character> charSet = new  HashSet<Character>();
         
        int lengtString = s.length();
        for(int i=0;i<lengtString;i++)
        	charSet.add(s.charAt(i));
        
        int windowSize = charSet.size();
        int bottomLength = 0;
        
        for(;windowSize>0;windowSize--){
        	 
	        for(int i=0;(i+windowSize)<=lengtString;i++){
	        	int jj = 0;
	        	charSet.clear();
	        	 
	        	for(;(jj<windowSize)&&(!charSet.contains(s.charAt(i+jj)));jj++){
	        		charSet.add(s.charAt(i+jj));
	        		 
	        	}
	        	if (bottomLength<charSet.size())bottomLength = charSet.size();
	        	
	        	 
	        
	        }
	        if(windowSize<=bottomLength)return bottomLength;
	        
        }
        
        return bottomLength;
    }
}