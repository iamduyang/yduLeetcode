/** 
 * 541. Reverse String II
 */
public class Solution {
    public String reverseStr(String s, int k) {
        int sLen = s.length();
        if(sLen==0)
            return "";
        
         String returnStr = "";
         
         int turns = sLen/k;
         for(int i=0;i<turns;i++){
             if(i%2==0)
                 returnStr+=reverseLocalStr(s.substring(i*k, (i+1)*k));  
             else
                 returnStr+=s.substring(i*k, (i+1)*k);
             
         }
         if(sLen>turns*k){
             if(turns%2==0)
                 returnStr+=reverseLocalStr(s.substring(k*turns,sLen));  
             else
                 returnStr+=s.substring(k*turns,sLen);   
         }
         return returnStr;
    }
    
    public String reverseLocalStr(String s) {
        String returnStr = "";
        int sLen = s.length();
        for(int i=0;i<sLen;i++)
            returnStr=s.charAt(i)+returnStr;
        
        return returnStr;
    }
    
}

