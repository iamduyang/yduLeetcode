/** 
 * 125. Valid Palindrome
 */

public class Solution {
    public boolean isPalindrome(String s) {
      
       s=s.replaceAll(" +","");
       if(s.equals(""))
    	   return true;
     
       s=s.replaceAll("[\\p{Punct}\\p{Space}]+", ""); 
       int slen = s.length();
       if(slen<1)
    	   return true;
       int countA=0;
       int countB=slen-1;
       int diff=0;
       char aa,bb;
       while(countA<countB){
    	   aa=s.charAt(countA);
    	   bb=s.charAt(countB);
    	   diff=aa-bb;
    	   if(diff==0){
    		   countB--;
        	   countA++;
    		   continue;
    	   }
    	   if(!(diff==32||diff==-32))
    		   return false;
    	   if((aa-58)*(bb-58)<0)
    		   return false;

    	   countB--;
    	   countA++;
       }
       
       return true;
    }
}
