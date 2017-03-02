/** 
 * 43. Multiply Strings 
 */
/**
 * Alert!!!!! Time Limit Exceeded 
 * */
public class Solution {
	 public String multiply(String num1, String num2) {
        String returnString ="";
        int len1 =num1.length();
        int count1 =num1.length()-1;
        int len2 =num2.length();
        int count2=0;
        int candidateInt =0;
        int flag =0;
        String thisTurnString ="0";
        String localString="";
        while(count1>=0){
	        for(count2=0;count2<len2;count2++){
	        	candidateInt =multiplyChars(num1.charAt(count1),num2.charAt(len2-count2-1))+flag;
	        	if(candidateInt==0)
	        		continue;
	        	localString =candidateInt+getNZeros(count2);	
	        	thisTurnString=addStrings(localString,thisTurnString);

	        	
	        } // end for
	        
	        if(flag>0)
	        	thisTurnString=flag+thisTurnString;
	        if(!thisTurnString.equals("0"))
	        	thisTurnString+=getNZeros(len1-1-count1);
	       
	        returnString = addStrings(returnString,thisTurnString);
	        thisTurnString ="0";
	        count1--;
	        flag=0;
        }
        

        	
        	
        return returnString;
    }
	
	public String getNZeros(int n){
		String returnStr="";
		for(int i=0;i<n;i++)
			returnStr+="0";
		return returnStr;
	}
	
    public int multiplyChars(char char1,char char2){
    	return (char1-48)*(char2-48); 	
    }
    
    
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



