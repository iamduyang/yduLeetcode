
/** 
 * 405. Convert a Number to Hexadecimal
 */
public class Solution {
    public String toHex(int num) {
    	if(num==0)
    		return "0";
    	String returnString ="";
        while(num!=0){
            int tempNum=0;
            for(int i=0;i<4;i++){
            	tempNum += (num&1)*(int)Math.pow(2, i);
            	num=num>>>1;
            }
            
            returnString=numToHex(tempNum)+returnString;
            
        }
        return returnString;
    }
    
     public String numToHex(int num) {
       if(num<10)
            return num+"";
       if(num==10)
    	   return "a";
       if(num==11)
    	   return "b";
       if(num==12)
    	   return "c";
       if(num==13)
    	   return "d";
       if(num==14)
    	   return "e";
       
       return "f";
    }
    
}