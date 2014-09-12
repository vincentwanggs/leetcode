public class SymmetricTree{
  
  // Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
  
  public boolean mirror(TreeNode r1, TreeNode r2) {
    
    if (r1 == null && r2 == null)
      return true;
    if (r1 == null || r2 == null)
      return false;
    if (r1.val == r2.val)
      return mirror(r1.left, r2.right) && mirror(r1.right, r2.left);
    else
      return false;
  }
  
  public boolean isSymmetric(TreeNode root) {
      
      if (root == null)
        return true;
      return mirror(root.left, root.right);
  }
}
