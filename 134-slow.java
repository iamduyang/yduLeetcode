public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int gasLen =gas.length;
    	int sumGas=0;
    	int sumCost = 0;
    	for(int i=0;i<gasLen;i++){
    		sumGas += gas[i];
    		sumCost += cost[i];
    	}
    	if(sumGas<sumCost)
    		return -1;
    	int remainInTank = 0;
    	int curPlace =0;
    	 
    	for(int returnPlace=0;returnPlace<gasLen;returnPlace++){//returnPalce is the same as the start place
    		curPlace=returnPlace;
    		remainInTank=remainInTank+gas[curPlace]-cost[curPlace]; 
    		if(remainInTank<0){
    			
    			remainInTank=0;
    			continue;
    		}
    		curPlace =curPlace+1;
    		if(curPlace==gasLen)
    			curPlace=0;
    		while(curPlace!=returnPlace){
    			remainInTank=remainInTank+gas[curPlace]-cost[curPlace]; 
        		if(remainInTank<0)
        			break;
        		curPlace =curPlace+1;
        		if(curPlace==gasLen)
        			curPlace=0;
        		
        			
        	
    		}
    		if(remainInTank>=0)
    			return returnPlace;
    		
    	}
    	
        return -1;
    }
}