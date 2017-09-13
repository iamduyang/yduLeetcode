/** 
 *  557. Reverse Words in a String III
 */
class Solution {
    public String reverseWords(String s) {
    	int len =s.length();
    	if(len<2)
    		return s;
    	String[] sArray = s.split(" ");
    	int lenArray = sArray.length;
    	if(lenArray<2)
    		return reverseString(s);
    	else{
    		StringBuffer aBuffer = new StringBuffer(reverseString(sArray[0]));
    		for(int i=1;i<lenArray;i++){
    			aBuffer.append(" ").append(reverseString(sArray[i]));	
    		}
    		
    		return aBuffer.toString();
    		
    		
    	}
    	
    	
    }
    public String reverseString(String s){
    	int len =s.length();
    	if(len<2)
    		return s;
    	else{
    		StringBuffer aBuffer = new StringBuffer(s.substring(len-1, len));
    		for(int i=len-2;i>=0;i--){
    			aBuffer.append(s.charAt(i));
    		}
    		
    		return aBuffer.toString();
    	}
    	
    	
    }
}

