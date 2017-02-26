/** 
 *   504. Base 7
 */
public class Solution {
    public String convertToBase7(int num) {
    	if(num==0)
    		return "0";
        String returnString ="";
        boolean flag =false;
        if(num<0){
        	num = -num;
        	flag = true;
        }
        while(num>6){
        	
        	returnString =(num%7)+returnString;
        	num =num/7;
        }
        if(num>0)
        	returnString =num + returnString;
        if(flag)
        	returnString = "-"+returnString;
        return returnString;
    }
}