/** 
 * 669. Trim a Binary Search Tree
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
       if(root==null)
           return root;
       else{
           if(root.val<=R&&root.val>=L){
              root.left=trimBST(root.left,L,R);
              root.right=trimBST(root.right,L,R);
              return root;
           }
           else{
               TreeNode leftRoot = trimBST(root.left,L,R);
               TreeNode rightRoot = trimBST(root.right,L,R);
               if(leftRoot==null)
                   return rightRoot;
               else if(rightRoot==null)
                   return leftRoot;
               else{
                   TreeNode leftRight =leftRoot.right;
                   leftRoot.right =root.right;
                   TreeNode leftmost = leftRoot;
                   while(leftRoot.left!=null)
                       leftmost=leftmost.left;
                   
                   leftmost.left = leftRight;
                   return leftRight;
                   
               }
           }
       }
    }
}


