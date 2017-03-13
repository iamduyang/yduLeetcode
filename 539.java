
/** 
 * 539. Minimum Time Difference
 */
public class Solution {
    public int findMinDifference(List<String> timePoints) {
    	int sizeList = timePoints.size();
    	if(sizeList<2)
    		return 2;
    	timeCompartor tc = new timeCompartor();
    	Collections.sort(timePoints,tc);  
    	int returnInt = 24*60+findDifference(timePoints.get(sizeList-1), timePoints.get(0));
    	int temp=0;
    	for(int i=0;i<sizeList-1;i++){
    		temp=findDifference(timePoints.get(i), timePoints.get(i+1));
    		if(temp<returnInt)
    			returnInt=temp;
    	}
    	return returnInt;
    }
    public int findDifference(String timePoints1, String timePoints2) {
    	 String[] strArray1 = timePoints1.split("\\:");
         String[] strArray2 = timePoints2.split("\\:");
         int int1=Integer.parseInt(strArray1[0]),int2=Integer.parseInt(strArray2[0]);
         int int11=Integer.parseInt(strArray1[1]),int22=Integer.parseInt(strArray2[1]);
         return (int2-int1)*60+int22-int11;
         
         
         
    }
}


class timeCompartor implements Comparator
{
     @Override
     public int compare(Object o1, Object o2)
    {

           String time1= (String )o1;

           String time2= (String )o2;
           String[] strArray1 = time1.split("\\:");
           String[] strArray2 = time2.split("\\:");
           int int1=Integer.parseInt(strArray1[0]),int2=Integer.parseInt(strArray2[0]);
           if(int1>int2)
        	   return 1;
           if(int1<int2)
        	   return -1;
           
           int1=Integer.parseInt(strArray1[1]); int2=Integer.parseInt(strArray2[1]);
           if(int1>int2)
        	   return 1;
           if(int1<int2)
        	   return -1;
           return 0;

    }
}
