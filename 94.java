/** 
 * 94. Binary Tree Inorder Traversal
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> returnList =new ArrayList<Integer>();
         if(root==null)
             return returnList;
         List<Integer> leftList =inorderTraversal(root.left);
         List<Integer> rightList =inorderTraversal(root.right);
         for(int i=0;i<leftList.size();i++)
             returnList.add(leftList.get(i));
         returnList.add(root.val);
         for(int i=0;i<rightList.size();i++)
             returnList.add(rightList.get(i));
         return returnList;
    }
}
