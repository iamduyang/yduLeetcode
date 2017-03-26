/**
 * 121. Best Time to Buy and Sell Stock
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int returnMaxProfit=0;
        int minPrice =Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            returnMaxProfit = Math.max(returnMaxProfit,prices[i]-minPrice);
        }
        return returnMaxProfit;
    }
}

