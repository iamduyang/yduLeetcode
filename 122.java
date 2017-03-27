/**
 * 122. Best Time to Buy and Sell Stock II
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int returnNum=0;
        int lenPrices = prices.length-1;
        for(int i=0;i<lenPrices;i++)
            if(prices[i+1]>prices[i])
                returnNum+=prices[i+1]-prices[i];
        return returnNum;
    }
}
