/** 
 * 119. Pascal's Triangle II
 */
public class Solution {
	public List<Integer> getRow(int rowIndex) {
		 List<Integer> returnList = new ArrayList<Integer>();
    	 if(rowIndex<0)
    		 return returnList;
    	 int[] oldArray = new int[rowIndex+1];
    	 int[] newArray = new int[rowIndex+1];
    	 oldArray[0]=1;
    	 newArray[0]=1;
    	 newArray[rowIndex]=1;
    	 oldArray[rowIndex]=1;
    	 for(int i=0;i<rowIndex;i++){
    		int j=1;
    		
    		if(i%2==0){
	    		
	    		for(;j<=i;j++)
	    			newArray[j]=oldArray[j-1]+oldArray[j];
	    		newArray[j]=1;
    		
    		}
    		else{
	    		
	    		for(;j<=i;j++)
	    			oldArray[j]=newArray[j-1]+newArray[j];
	    		oldArray[j]=1;
    			
    		}
    	 }
 
    	 if(rowIndex%2==0)
    		 newArray=oldArray;
 
    	 for(int i=0;i<=rowIndex;i++)
    		 returnList.add(newArray[i]);
    	 return returnList;
		 
	}


}