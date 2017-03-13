
/** 
 * 290. Word Pattern
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
     
        String[] strArray = str.split(" ");
        int lenString =pattern.length();
        if(lenString!=strArray.length)
            return false;
        
        String[] patternArray = new String[lenString];
        for(int i=0;i<lenString;i++)
            patternArray[i]=""+pattern.charAt(i);
        HashMap<String,String> patternSet =new HashMap<String,String>();
        HashMap<String,String> strSet =new HashMap<String,String>();
        
        for(int i=0;i<lenString;i++){
            if(patternSet.containsKey(patternArray[i])){
                String newValue=patternSet.get(patternArray[i])+" "+i;
                patternSet.put(patternArray[i], newValue);
            }
            else{
                patternSet.put(patternArray[i], ""+i);
            }
        }
        for(int i=0;i<lenString;i++){
            if(strSet.containsKey(strArray[i])){
                String newValue=strSet.get(strArray[i])+" "+i;
                strSet.put(strArray[i], newValue);
            }
            else{
                strSet.put(strArray[i], ""+i);
            }
        }
        
        int setSize=patternSet.size();
        if(setSize!=strSet.size())
            return false;
        Iterator it = patternSet.keySet().iterator();  
        while(it.hasNext()) {  
            String key = (String)it.next(); 
            String value = patternSet.get(key);
            if(!strSet.containsValue(value))
                return false;
            
        }
        return true;
        
    }
}



