/** 
 * 172. Factorial Trailing Zeroes
 */

public class Solution {
    public int trailingZeroes(int n) {
        int countFive=0;
        while(n>0){
        	n/=5;
        	countFive+=n;
        }
        return countFive;
    }
}
