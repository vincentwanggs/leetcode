public class FlattenBiTree{
  public void flatten(TreeNode root) {
    
    if (root == null)
      return;
    root = helper(root);
  }
  public TreeNode helper(TreeNode root){
    if (root == null)
      return root;
    TreeNode flattenedLeftTree = helper(root.left);
		TreeNode flattenedRightTree = helper(root.right);
		root.right = flattenedLeftTree;
		root.left = null;
		
		// go to the right end of the root
		
		TreeNode right = root;
		while (right.right != null)
		  right = right.right;
		right.right = flattenedRightTree;
		return root;
		
  }
}
