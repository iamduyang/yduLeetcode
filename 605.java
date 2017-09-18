
/**
 *  605. Can Place Flowers
 * */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n<1)
        	return true;
        int len = flowerbed.length;
        if(len<1)
        	return false;
        int tempZero=0,firstOne=-1,lastOne =-1;
        for(int i=0;i<len;i++){
        	if(flowerbed[i]==1){
        		if(firstOne==-1){
        			firstOne=i;
        			lastOne=i;
        		}
        		else
        			lastOne=i;
        	}
        }
        if(firstOne==-1){
        	if(len%2==1)
        		return (len/2+1)>=n;
        	else
        		return len/2>=n;
        }
        
        int beginZeros = firstOne-0,lastZeros = len-1-lastOne;
        int beginLastFlowers = (beginZeros/2)+(lastZeros/2);
        n-=beginLastFlowers;
        if(n<1)
        	return true;
        int tempZeros=0;
        for(int i=firstOne+1;i<lastOne;i++){
        	if(flowerbed[i]==1){
        		if(tempZeros<3){
        			tempZeros=0;
        			continue;
        		}
        		n-=(tempZeros-1)/2;
        		if(n<1)
        			return true;
        		tempZeros=0;
        			
        		
        	}
        	else
        		tempZeros++;
        	
        }
        if(tempZeros>2){
        	n-=(tempZeros-1)/2;
    		if(n<1)
    			return true;
        }
        return false;
        
    }
}

