/** 
 * 151. Reverse Words in a String
 */
public class Solution {
    public String reverseWords(String s) {

        String[] sArray = s.trim().split("\\s+");
        if(sArray.length==0)
        	return "";
        String returnStr="";
        for(int i=sArray.length-1;i>0;i--)
        	returnStr += sArray[i]+" ";
        returnStr+=sArray[0];
        
        return returnStr;
    }
}