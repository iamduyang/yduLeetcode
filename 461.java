/** 
 * 461. Hamming Distance
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int returnInt = 0;
        while(x>0&&y>0){
        	if(x%2!=y%2)
        	   returnInt++;
        	x/=2;
        	y/=2;
        }
        if(x==0)
        	x=y;
        while(x>0){
        	if(x%2==1)
        		returnInt++;
        	x/=2;
        }
        return returnInt;
    }
}