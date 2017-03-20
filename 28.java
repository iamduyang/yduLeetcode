/**
 * 28. Implement strStr()
 * */

public class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLen=haystack.length();
        int needleLength =needle.length();
        
        int lenDiff=haystackLen-needleLength;
        if(lenDiff<0)
            return -1;
        if(needleLength==0)
            return 0;
        for(int i=0;i<lenDiff+1;i++){
            for(int j=0;j<needleLength;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
                if(j==(needleLength-1))
                    return i;
            }
        }
        return -1;
    }
}


