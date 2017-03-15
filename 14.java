/** 
 * 14. Longest Common Prefix
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
       int strLength=strs.length;
       if(strLength==0)
    	   return "";
       if(strLength==1)
    	   return strs[0];
       int smallLen=strs[0].length();
       for(int i=1;i<strLength;i++){
    	   if(strs[i].length()<smallLen)
    		   smallLen=strs[i].length();
    	   
       }
       String returnStr ="";
       for(int i=0;i<smallLen;i++){
    	   char thisPlaceChar=strs[0].charAt(i);
    	   for(int j=1;j<strLength;j++){
    		   if(thisPlaceChar!=strs[j].charAt(i))
    			   return returnStr;
    	   }
    	   returnStr+=thisPlaceChar;
       }
       
       return returnStr;
       
       
    }
}

