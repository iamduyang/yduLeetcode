/**
 *  129. Sum Root to Leaf Numbers
 * */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null)
        	return 0;
        ArrayList<String> numberStrings= getNumberString(root);
        int returnIt=0;
        for(String aa:numberStrings)
        	returnIt+=Integer.parseInt(aa);
        return returnIt;
    }
    public ArrayList<String> getNumberString(TreeNode root){
    	ArrayList<String> returnArrayList=new ArrayList<String>();
    	if(root==null)
    		return returnArrayList;
    	if(root.left==null&&root.right==null){
    		returnArrayList.add(""+root.val);
    		return returnArrayList;
    	}
    	if(root.left!=null){
    		ArrayList<String> leftArrayList = getNumberString(root.left);
    		for(String aa:leftArrayList)
    			returnArrayList.add(root.val+aa);
    	}
    	if(root.right!=null){
    		ArrayList<String> rightArrayList = getNumberString(root.right);
    		for(String aa:rightArrayList)
    			returnArrayList.add(root.val+aa);
    	}
    	
    	return returnArrayList;
    	
    }
}


