import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcodeDataPrepare {

	public static  ListNode makeAListNode(int[] intArray) {
		if (intArray.length==0)
			return null;
		 ListNode returnListNode =new ListNode(intArray[0]);
		 ListNode curListNode =returnListNode;
		 for(int i=1;i<intArray.length;i++){
			 curListNode.next=new ListNode(intArray[i]);
			 curListNode=curListNode.next;
		 }
			 
		 
		 return returnListNode;
		 
	}
	
	public static  void printAList(ListNode printedList) {
		while(printedList!=null){
			System.out.println(printedList.val);
			printedList=printedList.next;
		}
		 
	}
	
	
	/** 
	 * 108. Convert Sorted Array to Binary Search Tree
	 */
	 public TreeNode sortedArrayToBST(int[] nums) {
	        int numsLen = nums.length;
	        if(numsLen==0)
	        	return null;
	        return sortedArrayToBSTwithLimit(nums,0,numsLen-1);
	        
	 }
	    
	 public TreeNode sortedArrayToBSTwithLimit(int[] nums,int beginNum,int endNum) {
	        int numsLen =endNum-beginNum+1;
	        if(numsLen==1)
	        	return new TreeNode(nums[endNum]);
	        int middle=(endNum+beginNum)/2;
	        TreeNode thisTree = new TreeNode(nums[middle]);
	        if(middle>beginNum)
	        	thisTree.left=sortedArrayToBSTwithLimit(nums,beginNum,middle-1);
	        if(middle<endNum)
	        	thisTree.right=sortedArrayToBSTwithLimit(nums,middle+1,endNum);
	            
	        return thisTree;
	}	    
	    
 

	
}