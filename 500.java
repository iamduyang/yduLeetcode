
/** 
 * 500. Keyboard Row
 */
public class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> set1 =new HashSet<Character>();
        HashSet<Character> set2 =new HashSet<Character>();
        HashSet<Character> set3 =new HashSet<Character>();
       String charStr1="qwertyuiop";
       String charStr2="asdfghjkl";
       String charStr3="zxcvbnm";
       for(int i=0;i<charStr1.length();i++){
    	   set1.add(charStr1.charAt(i));
    	   set1.add((char) (charStr1.charAt(i)-32));
       }
       for(int i=0;i<charStr2.length();i++){
    	   set2.add(charStr2.charAt(i));
    	   set2.add((char) (charStr2.charAt(i)-32));
       }
       for(int i=0;i<charStr3.length();i++){
    	   set3.add(charStr3.charAt(i));
    	   set3.add((char) (charStr3.charAt(i)-32));
       }
       ArrayList<String> returnTemp = new ArrayList<String>();
       for(int i=0;i<words.length;i++){
    	   String nowString = words[i];
    	   boolean flag;
    	   if(set1.contains(nowString.charAt(0)))
    			   flag=checkInThisSet(nowString,set1);
    	   else if(set2.contains(nowString.charAt(0)))
			   flag=checkInThisSet(nowString,set2);
    	   else 
    		   flag=checkInThisSet(nowString,set3);
    	   if(flag)
        	   returnTemp.add(nowString);
       }
       
       String[] arrString = returnTemp.toArray(new String[returnTemp.size()]);
       return arrString;
        
    }
    
    boolean checkInThisSet(String nowCheck,HashSet thisSet){
    	
    	for(int i=1;i<nowCheck.length();i++){
    		if(!thisSet.contains(nowCheck.charAt(i)))
    			return false;
    	}
    		
    	return true;
    }
}




