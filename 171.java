/** 
 * 171. Excel Sheet Column Number
 */

public class Solution {
    public int titleToNumber(String s) {
    	int sLen = s.length();
        int returnInt=1;
        returnInt*=(s.charAt(0)-64);
        for(int i=1;i<sLen;i++){
        	returnInt=(s.charAt(i)-64)+returnInt*26;
        }
        return returnInt;
    }
}