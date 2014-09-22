public class ValidateBST{

// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.


  public boolean helper(TreeNode root, int lower, int upper){
    if (root == null)
      return true;
    if (root.val <= lower || root.val >= upper )
      return false;
    return helper (root.left, lower, root.val) && helper(root.right, root.val, upper);
  }
  public boolean isValidBST(TreeNode root) {
      return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);  
  }
}
