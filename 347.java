/** 
 * 347. Top K Frequent Elements
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
       // Arrays.sort(nums);
        int numsLen =nums.length;
        HashMap<Integer,Integer> numsMap = new  HashMap<Integer,Integer> ();
        for(int i=0;i<numsLen;i++){
        	if(numsMap.containsKey(nums[i])){
        		int value = numsMap.get(nums[i])+1;
        		numsMap.put(nums[i], value);
        	}
        	else{
        		numsMap.put(nums[i], 1);
        	}
        }
        List<Map.Entry<Integer, Integer>> mapList =
        	    new ArrayList<Map.Entry<Integer, Integer>>(numsMap.entrySet());
        Collections.sort(mapList, new Comparator<Map.Entry<Integer, Integer>>() {   
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {      
               return (o2.getValue() - o1.getValue()); 
            }
        }); 
        List<Integer> returnList = new ArrayList<Integer>();
        for(int i=0;i<k;i++)
        	returnList.add(mapList.get(i).getKey());
        	
        
        return returnList;
        	
    }
}