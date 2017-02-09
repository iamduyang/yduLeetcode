public class Solution {

    public String countAndSay(int n) {
    	if(n==0)
    		return null;
    	String returnSentence = "1";
        for(int i=0;i<n-1;i++)
        	returnSentence = getTheAnswer(returnSentence); 
        return returnSentence;
    }
    
    public String getTheAnswer(String originString) {
    	 
    	String returnSting = "";
    	int orilen = originString.length();
    	for(int i=0;i<orilen;i++){
    		char curChar = originString.charAt(i);
    		int count = 1;
    		while((i+1<orilen)&&originString.charAt(i+1)==curChar){
    			count++;
    			i++;
    			
    		}
    		
    		returnSting +=""+ count +curChar;
    	}
    	return returnSting;
    }
    
}