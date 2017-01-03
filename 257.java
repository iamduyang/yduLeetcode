
public class Solution {
	    public List<String> binaryTreePaths(TreeNode root) {
	    	 List<String> returnPathString =new ArrayList<String>();
	        if(root==null)
	        	return returnPathString;
	       
	        if((root.left==null)&&(root.right==null)){
	        	returnPathString.add(root.val+"");
	        	return returnPathString;
	        }
	        	
	        if(root.left!=null){
	        	for(String returnString: binaryTreePaths(root.left))
	        		returnPathString.add(root.val+"->"+returnString);
	        	
	        }
	        if(root.right!=null){
	        	for(String returnString: binaryTreePaths(root.right))
	        		returnPathString.add(root.val+"->"+returnString);
	        	
	        }
	        
	        return returnPathString;
	    }
	}