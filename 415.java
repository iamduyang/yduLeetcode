/** 
 * 415. Add Strings 
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        String returnString ="";
        int count1 =num1.length()-1;
        int count2 =num2.length()-1;
        int candidateInt =0;
        int flag =0;
        while(count1>=0&&count2>=0){
        	candidateInt =addChars(num1.charAt(count1),num2.charAt(count2))+flag;
        	if(candidateInt>9){
        		flag=1;
        		returnString=(candidateInt-10)+returnString;
        	}
        	else{
        		flag=0;
        		returnString=candidateInt+returnString;
        	}
        	count1--;
        	count2--;
        }
        
        while(count1>=0){
        	candidateInt =addChar(num1.charAt(count1))+flag;
        	if(candidateInt>9){
        		flag=1;
        		returnString=(candidateInt-10)+returnString;
        	}
        	else{
        		flag=0;
        		returnString=candidateInt+returnString;
        	}
        	count1--;
        }
        while(count2>=0){
        	candidateInt =addChar(num2.charAt(count2))+flag;
        	if(candidateInt>9){
        		flag=1;
        		returnString=(candidateInt-10)+returnString;
        	}
        	else{
        		flag=0;
        		returnString=candidateInt+returnString;
        	}
        	count2--;       	
        }
        if(flag==1)
        	returnString="1"+returnString;
        	
        	
        return returnString;
    }
    public int addChars(char char1,char char2){
    	return (char1-96+char2);
    	
    }
    public int addChar(char char1){
    	return (char1-48);
    	
    }
}