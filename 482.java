public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int sLength = S.length();
        String outString ="";
        int localCount =0;
        String localString ="";
        for(int i=sLength-1;i>=0;i--){
        	if(S.charAt(i)=='-')
        		continue;
        	localString=(S.charAt(i)+"").toUpperCase()+localString;
        	localCount++;
        	if(localCount==K){
        		outString ="-"+localString+outString;
        		localCount=0;
        		localString="";
        	}
        }
        if(outString.equals(""))
        	return localString;
        if(localCount>0)
        	return localString+outString;
        else
        	return outString.substring(1, outString.length());
    }
}