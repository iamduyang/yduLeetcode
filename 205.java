/** 
 * 205. Isomorphic Strings
 */

public class Solution {
	 public boolean isIsomorphic(String s, String t) { 
     
     
        int lenString =s.length();
        
        Character[] sArray = new Character[lenString];
        Character[] tArray = new Character[lenString];
        for(int i=0;i<lenString;i++){
        	sArray[i]=s.charAt(i);
        	tArray[i]=t.charAt(i);
        }
        
        HashMap<Character,Character> patternMap =new HashMap<Character,Character>();
       
        
        for(int i=0;i<lenString;i++){
        	if(patternMap.containsKey(sArray[i])){
        		if(patternMap.get(sArray[i])!=tArray[i])
        			return false;
        	}
        	else{
        		if(patternMap.containsValue(tArray[i]))
        			return false;
        		patternMap.put(sArray[i],tArray[i]);
        	}
        }
        
        return true;  
    }
}



