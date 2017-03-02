/** 
 * 371. Sum of Two Integers
 */

public class Solution {
	public int getSum(int a, int b) {
	    if(b == 0)
	       return a;
	    
	   int inbitSum,carry;
	   inbitSum = a^b;
	   carry = (a&b)<<1;
	   return getSum(inbitSum,carry);
	
	}
	
}