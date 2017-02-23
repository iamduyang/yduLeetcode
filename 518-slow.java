/** 
 *  518. Coin Change 2
 */

public class Solution {
    public int change(int amount, int[] coins) {
    	int coinsLength = coins.length;
    	if(amount==0)
    		return 1;


    	if(coinsLength<1)
    		return 0;
    	
        int coinCom = 0;
        int currentAmount = amount;
        for(int i=coinsLength-1;i>=0;i--){
        	while(currentAmount>coins[i]){
        		coinCom +=changeWithLimit(currentAmount-coins[i],coins,i); //i is excluded
        		currentAmount-=coins[i];
        	}
        	if(currentAmount==coins[i])
        		coinCom++;
        	currentAmount = amount;
        		
        }
        return coinCom;
    }
    public int changeWithLimit(int amount, int[] coins,int limitNum) {
    	if(amount<1)
    		return 0;

    	
        int coinCom = 0;
        int currentAmount = amount;
        for(int i=limitNum-1;i>=0;i--){
        	while(currentAmount>coins[i]){
        		coinCom +=changeWithLimit(currentAmount-coins[i],coins,i); //i is excluded
        		currentAmount-=coins[i];
        	}
        	if(currentAmount==coins[i])
        		coinCom++;
        	currentAmount = amount;
        		
        }
        return coinCom;
    }

}