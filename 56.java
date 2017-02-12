
public class Solution {

	
    static class myCompare implements Comparator<Interval> {

        
        public int compare(Interval arg0, Interval arg1) {

             
             return arg0.start - arg1.start;
        }
    }

	
	
    public List<Interval> merge(List<Interval> intervals) {
    	
    	 if(intervals.size()<2)
    		 return intervals;
    	 Collections.sort(intervals, new myCompare());
    	 List<Interval> returnList = new ArrayList<Interval>();
    	 Interval curStudy = intervals.get(0);
    	 int intervalsSize = intervals.size();
    	 for(int ii=1;ii<intervalsSize;ii++){
    		 int start1 = curStudy.start;
    		 int end1 = curStudy.end;
    		 int start2 = intervals.get(ii).start;
    		 int end2 = intervals.get(ii).end;
    		 if(end1<start2){
    			 returnList.add( curStudy);
    			 curStudy =  intervals.get(ii);
    		 }
    		 else{
    			 int endStore = end1<end2?end2:end1;
    			 curStudy = new Interval(start1,endStore);
    		 }
		 
    	 }
    	 
    	 returnList.add( curStudy);
    	 return returnList;
    }
}