/** 
 * 441. Arranging Coins
 */
/**"Your runtime beats 90.78% of java submissions!" 22:30pm 27th Feb 2017*/
public class Solution {
    public int arrangeCoins(int n) {
        return (int)Math.floor(Math.sqrt((long)2*n+0.25)-0.5);
    }
}