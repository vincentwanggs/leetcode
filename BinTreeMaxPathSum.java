public class BinTreeMaxPathSum{

  public int maxPathSum(TreeNode root) {
      ArrayList<Integer> maxVal = new ArrayList<Integer> ();
		maxVal.add(Integer.MIN_VALUE);
      helper(root,maxVal);
      return maxVal.get(0);
  }
  
  public int helper(TreeNode root, ArrayList<Integer> max){
    if (root == null)
      return 0;
    int left = helper(root.left,max);
    int right = helper(root.right,max);
    
    int sum = Math.max(left, 0) + Math.max(right,0)+root.val;
    if (sum > max.get(0))
      max.set(0,sum);
    return root.val + Math.max(Math.max(left, 0), Math.max(right, 0));
  }
}
