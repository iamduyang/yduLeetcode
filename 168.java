/** 
 *	168. Excel Sheet Column Title
 */
public class Solution {
    public String convertToTitle(int n) {
        String returnStr="";
        while(n!=0){
        	int nMod26=n%26;
        	if(nMod26!=0){
        		returnStr=num2char(nMod26)+returnStr;
        		n=n/26;
        	}
        	else{
        		returnStr="Z"+returnStr;
        		n=n/26-1;
        	}
        	
        }
        
        return returnStr;
    }
    public char num2char(int num){
    	return (char)(num+64);
    }
}