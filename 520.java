/** 
 *   520. Detect Capital
 */
public class Solution {
    public boolean detectCapitalUse(String word) {

    	int wordLength = word.length();
    	if(wordLength<2)
    		return true;
    	boolean returnBool = true;
    	boolean firstCap =true;
    	if(word.charAt(0)>95)
    		firstCap =false;
    	if(firstCap){// first is cap
    		if(word.charAt(1)>95){
        		for(int i=2;i<word.length();i++){
        			if(word.charAt(i)<95)
        				return false;
        		}
    		}
    		else{
    			for(int i=2;i<word.length();i++){
        			if(word.charAt(i)>95)
        				return false;
        		}
    		}

    	}
    	else{
    		for(int i=1;i<wordLength;i++)
    			if(word.charAt(i)<95)
    				return false;
    	}
    	return returnBool;
    }
}