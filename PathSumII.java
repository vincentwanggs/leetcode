public class PathSumII{

  pubic void helper (TreeNode root, int sum, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res ){
    if (root == null)
      return;
    if (root.left == null && root.right == null){
      if (root.val == sum){
         res.add(new ArrayList<Integer>(path));
         return;
      }
    }
    path.add(root.val);
    helper(root.left, sum - root.val, path, res);
    helper(root.right, sum -root.val, path, res);
    path.remove(root.val);
  }
  public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
      ArrayList<Integer> path = new ArrayList<Integer> ();
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
      helper(root,sum,path,res);
      return res;
  }
}
