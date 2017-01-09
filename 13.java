public class Solution {
    public int romanToInt(String s) {
    	int returnInt = char2Number(s.charAt(0));
    	for(int ii=1;ii<s.length();ii++){
    		int intFirst=char2Number(s.charAt(ii-1));
    		int intSecond=char2Number(s.charAt(ii));
    		if(intFirst<intSecond){
    			returnInt += intSecond-2*intFirst;
    		}
    		else
    			returnInt += intSecond;
    		
    	}
    	
    	return returnInt;
    }
    
    public int char2Number(char charOfIt){
        switch (charOfIt) {
	        case 'I': return 1;
	        case 'V': return 5;
	        case 'X': return 10;
	        case 'L': return 50;
	        case 'C': return 100;
	        case 'D': return 500;
	        case 'M': return 1000;
        }
        return 0;
    }
}