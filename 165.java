/** 
 * 165. Compare Version Numbers
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1.equals(version2))
        	return 0;
        String[] strArray1=version1.split("\\.");
        String[] strArray2=version2.split("\\.");
        int len1 = strArray1.length;
        int len2 = strArray2.length;
        int comLen = (len1>len2)?len2:len1;
        
        for(int i=0;i<comLen;i++){
        	int int1=Integer.parseInt(strArray1[i]);
        	int int2=Integer.parseInt(strArray2[i]);
        	if(int1>int2)
        		return 1;
        	
        	if(int1<int2)
        		return -1;
        }
        if(len1>len2){
        	for(int i=comLen;i<len1;i++)
        		if (Integer.parseInt(strArray1[i])!=0)
        			return 1;
        	return 0;
        }
        for(int i=comLen;i<len2;i++)
    		if (Integer.parseInt(strArray2[i])!=0)
    			return -1;
    	return 0;
    }
}


