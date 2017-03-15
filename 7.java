
/** 
 * 7. Reverse Integer
 */
public class Solution {
    public int reverse(int x) {
    	if(x==0)
    		return 0;
        long tX = x;
        long returnLong =0;
        if(tX>0){
        	while(tX>0){
	        	returnLong=(returnLong)*10+tX%10;
	        	tX=tX/10;
	        	
        	}
        	if(returnLong>Integer.MAX_VALUE)
        		return 0;
        	else
        		return (int)returnLong;
        }
        else{
        	tX=-tX;
        	while(tX>0){
	        	returnLong=(returnLong)*10+tX%10;
	        	tX=tX/10;
	        	
        	}
        	returnLong=-returnLong;
        	if(returnLong<Integer.MIN_VALUE)
        		return 0;
        	else
        		return (int)returnLong;
        	
        }
    }
}

