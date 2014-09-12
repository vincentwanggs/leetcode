public class BalancedBinTree{

// a height-balanced binary tree is defined as a binary tree 
//in which the depth of the two subtrees of every node never differ by more than 1.
  
    public int depth(TreeNode root){
      if (root == null)
        return 0;
      return (Math.max(depth(root.left), depth(root.right))+1);
    }
    
    public boolean isBalanced(TreeNode root) {
        if (root == null)
          return true;
        if (Math.abs(depth(root.left) - depth(root.right)) <= 1)
          return isBalanced(root.left) && isBalanced(root.right);
        else
          return false;
    }
}
