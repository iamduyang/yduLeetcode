
public class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int shortLen = (aLen>bLen)?bLen:aLen;
        boolean flag=false;
        String returnStr ="";
        for(int ii=0;ii<shortLen;ii++){
        	String addedResult = addOneDigit(a.charAt(aLen-ii-1),b.charAt(bLen-ii-1),flag);
        	returnStr =  addedResult.substring(1,2)+returnStr;
        	if(addedResult.charAt(0)=='1')
        		flag = true;
        	else
        		flag = false;
        }
        String lastOperation ="";
        if(aLen>shortLen)
        	lastOperation = a.substring(0, aLen-shortLen);
        else if(bLen>shortLen)
        	lastOperation = b.substring(0, bLen-shortLen);
        int lenLast = lastOperation.length();
        for(int ii=0;ii<lenLast;ii++){
        	String addedResult = addOneDigit('0',lastOperation.charAt(lenLast-ii-1),flag);
        	returnStr =  addedResult.substring(1,2)+returnStr;
        	if(addedResult.charAt(0)=='1')
        		flag = true;
        	else
        		flag = false;
        }
        if(flag)
        	returnStr = "1"+returnStr;
        
        		
    	return returnStr;
    }
    public String addOneDigit(char a,char b,boolean flag){
        if(flag){
        	if(a=='0'&&b=='0')
        		return "01";
        	else if(a=='1'&&b=='1')
        		return "11";
        	else
        		return "10";
				
        }
        else{
        	if(a=='0'&&b=='0')
        		return "00";
        	else if(a=='1'&&b=='1')
        		return "10";
        	else
        		return "01";
        }
    }
}