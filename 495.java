/** 
 * 495. Teemo Attacking
 */
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration==0||timeSeries.length==0)
        	return 0;
        
        int returnInt=0;
        for(int i=0;i<timeSeries.length-1;i++){
        	int timeInterval = timeSeries[i+1]-timeSeries[i];
        	if(timeInterval<duration)
        		returnInt+=timeInterval;
        	else 
        		returnInt+=duration;   	
        }
        returnInt+=duration;   	
        return returnInt;
    }
}

