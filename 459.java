/** 
 * 459. Repeated Substring Pattern
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
    	int slen = s.length();
    	ArrayList<Integer> factorsList = findAllFactor(slen);
    	for(int factorInt:factorsList ){
    		boolean thisTurnFlag =true;//
    		for(int i=0;i<factorInt;i++){
    			
    			char compareChar = s.charAt(i);
    			for(int comparedNum =i+factorInt;comparedNum<slen;comparedNum+=factorInt){
    				if(compareChar==s.charAt(comparedNum))
    					continue;
    				else{
    					thisTurnFlag =false;
    					break;
    				}
    			}
    			
    			if(!thisTurnFlag)

    				break;
    				
    		}
    		if(thisTurnFlag)

				return true;
    	
    		
    	}
    	return false;
    }
    
	public static ArrayList<Integer> findAllFactor(int num) {
		ArrayList<Integer> returnArrayList = new ArrayList<Integer>();
		ArrayList<Integer> primeList =  resolve_Prime(num);
		int primeListLen = primeList.size();
		int lenPrimeListPower2MinusOne =(int)Math.pow(2,primeListLen)-1;
		int addCandidate =1;
		for(int i=0;i<lenPrimeListPower2MinusOne;i++){
			String iString = Integer.toBinaryString(i);
			int iStringLen = primeListLen-iString.length();
			while(iStringLen>0){
				iString = "0"+iString;
				iStringLen--;
			}
			for(int countStr = 0;countStr<primeListLen;countStr++){
				if(iString.charAt(countStr)=='1')
					addCandidate*=primeList.get(countStr);
			}
			returnArrayList.add(addCandidate);
			addCandidate=1;
			
		}
		return returnArrayList; // not included the num itself
	}
	
	public static ArrayList<Integer> resolve_Prime(int num) {
		ArrayList<Integer> returnArrayList = new ArrayList<Integer>();
		int i = 2;
		while (i <= num) {
			if (num % i == 0) {	
				returnArrayList.add(i);		
				num = num / i;		
				i = 2;
			} else 	
				i++;			
		}
		return returnArrayList;
	}
}