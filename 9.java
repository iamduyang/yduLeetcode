
public class Solution {
  
    	public boolean isPalindrome(int x) {
    	if (x<0)
    		return false; 
    	if(x<9)
    		return true; 
    		
    		

        int lenghtOfDetect=1;
        for (lenghtOfDetect=1; (x/lenghtOfDetect) >= 10; lenghtOfDetect*=10 )
        	;

        while (x != 0 ) {
            int left = x / lenghtOfDetect;
            int right = x % 10;

            if(left!=right){
                return false;
            }

            x = (x%lenghtOfDetect) / 10;
            lenghtOfDetect /= 100;
        }
        return true;
    	}
}
