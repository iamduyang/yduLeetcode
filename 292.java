/** 
 * 292. Nim Game
 */

public class Solution {
    public boolean canWinNim(int n) {
       
    	//return (n%4==0)?false:true;
    	return !((n>>2)<<2==n);
    	//return !(n%4==0);
    	 
    }
}