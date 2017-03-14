/** 
 * 290. Word Pattern
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
     
        String[] strArray = str.split(" ");
        int lenString =pattern.length();
        if(lenString!=strArray.length)
            return false;
        
        Character[] patternArray = new Character[lenString];
        for(int i=0;i<lenString;i++)
            patternArray[i]=pattern.charAt(i);
        
        HashMap<Character,String> patternMap =new HashMap<Character,String>();
       
        
        for(int i=0;i<lenString;i++){
            if(patternMap.containsKey(patternArray[i])){
                String matchValue=patternMap.get(patternArray[i]);
                if(!matchValue.equals(strArray[i]))
                    return false;
            }
            else{
                if(patternMap.containsValue(strArray[i]))
                    return false;
                patternMap.put(patternArray[i],strArray[i]);
            }
        }
        
        return true;  
    }
}



