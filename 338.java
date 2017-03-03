/** 
 * 338. Counting Bits
 */
public class Solution {
	public int[] countBits(int num) {
	    int[] returnArray = new int[num + 1];
	    for (int i=1; i<=num; i++) 
	    	returnArray[i] = returnArray[i >> 1] + (i & 1);
	    	//returnArray[i] = returnArray[i >> 1] + (i % 2); // i % 2 is slower 
	    return returnArray;
	}
}
