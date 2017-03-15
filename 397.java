/** 
 * 397. Integer Replacement
 */
public class Solution {
    public int integerReplacement(int n) {
        if(n==1)
        	return 0;
        if(n%2==0)
        	return 1+integerReplacement(n>>1);
        int right = 2+integerReplacement(n>>1);
        int  left = 2+integerReplacement(1+(n>>1));
        return (left>right)?right:left;
    }
}