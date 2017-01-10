public class Solution {

	 public int myAtoi(String str) {
	        String shortStr =str.trim();
	        if (str.length()==0)
	        	return 0;
	        else if (shortStr.length()>=2&&char2num(shortStr.charAt(0))==-1&&char2num(shortStr.charAt(1))==-1)
	        	 
	        		return 0;

	        if(shortStr.charAt(0)=='-')
	        	return str2numMinus(shortStr.substring(1, shortStr.length()));
	        else  if(shortStr.charAt(0)=='+')
	        	return str2num(shortStr.substring(1, shortStr.length()));
	        else
	        	return str2num(shortStr);
	 }
	 public int str2num(String oriStr) {
		 long returnNum=0;
		 for(int ii=0;ii<oriStr.length();ii++){
			 int numOfIt = char2num(oriStr.charAt(ii));
			 if(returnNum>=Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			 
			 else if(numOfIt==-1)
				 break;
			 else
				 returnNum =10*returnNum+numOfIt;
		 }

		 if(returnNum>=Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
		 return (int)returnNum;
	 }
	 public int str2numMinus(String oriStr) {
		 long returnNum=0;
		 for(int ii=0;ii<oriStr.length();ii++){
			 int numOfIt = char2num(oriStr.charAt(ii));
			 if(returnNum<=Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			 else if(numOfIt==-1)
				 break;
			 else
				 returnNum =10*returnNum-numOfIt;
	 
		 }
		if(returnNum<=Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		return (int)returnNum;
	 }

	 public int char2num(char oriChar) {
	        
		 switch(oriChar){
	        case '1':return 1;
	        case '2':return 2;
	        case '3':return 3;
	        case '4':return 4;
	        case '5':return 5;
	        case '6':return 6;
	        case '7':return 7;
	        case '8':return 8;
	        case '9':return 9;
	        case '0':return 0;
	        
	        }
		 return -1;
	 }
	
}