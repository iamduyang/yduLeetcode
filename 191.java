/** 
 * 191. Number of 1 Bits
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       
    	int returnNum=0;
        while(n!=0){ // n>0 is not accepted
        	
        	returnNum+=(n&1);
        	n=n>>>1;
        }
        return returnNum;
    }
}
