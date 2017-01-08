
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> returnList= new ArrayList<List<Integer>>();
        int numsLength =nums.length;
        if(numsLength<3)
          return returnList;
      Arrays.sort(nums);
    
      
       int jj =0;
       int kk =0;
       for(int ii=0;ii<numsLength;ii++){
         if (nums[ii]>0)
           break;
         
         if(ii>0&&nums[ii]==nums[ii-1])
           continue;
         jj=ii+1;
         kk=numsLength-1;
         while(jj<kk){
           int sumIJK =nums[ii]+nums[jj]+nums[kk];
           if(sumIJK<0)
             jj++;
           else if(sumIJK>0)
             kk--;
           else{
            List<Integer> listTemp= new ArrayList<Integer>();
            listTemp.add(nums[ii]);
            listTemp.add(nums[jj]);
            listTemp.add(nums[kk]);
            returnList.add(listTemp);
            jj++;
            kk--;
            while(jj<kk&&nums[jj]==nums[jj-1])
              jj++;
            while(jj<kk&&nums[kk]==nums[kk+1])
              kk--;
           }
         }
            
                 
                  
               
      }
       return returnList;
           
      
    }
}