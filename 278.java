/** 
 *	278. First Bad Version
 */


public class Solution extends VersionControl {

	public int firstBadVersion(int n) {
	   int beginIndex=1,endIndex=n;
	   while(beginIndex<endIndex){
		   int middleIndex = beginIndex+(endIndex-beginIndex)/2;
		   if(!isBadVersion(middleIndex))
			   beginIndex=middleIndex+1;
		   else
			   endIndex= middleIndex;
	   }
	   return beginIndex;
	}
    
 
}
	