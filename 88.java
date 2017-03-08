
/** 
 * 88. Merge Sorted Array
 */
public class Solution {
	public void merge(int nums1[], int m, int nums2[], int n) {
	    int i=m-1, j=n-1, k=m+n-1;
		
		
	    while (i>-1 && j>-1){
	    	
	    	if(nums1[i]>nums2[j]){
	    		
	    		nums1[k]=  nums1[i];
	    		k--;i--;
	    	}
	    	else{
	    		System.out.println("In the secoun loop: "+ nums1[i]);
	    		nums1[k]= nums2[j];
	    		k--;j--;
	    	}
	    	
	    }
	    while (j>-1)        
	    	nums1[k--]=nums2[j--];
	}
}