public class UniqueBSTII{
   
  // to get a set of trees rooted between low and high
  public ArrayList<TreeNode> helper(int low, int high){
  
    ArrayList<TreeNode> res = new ArrayList<TreeNode>();
    if (low > high){
      res.add(null);
      return res;
    }
    
    for (int i =  low; i <= high; i ++){
      ArrayList<TreeNode> lefts = helper(low, i - 1);
      ArrayList<TreeNode> rights = helper(i+1,high);
      
      for (int j = 0; j < lefts.size(); j ++){
        for (int k = 0; k < rights.size(); k ++){
          TreeNode root = new TreeNode(i);
          root.left = lefts.get(j);
          root.right = rights.get(k);
          res.add(root);
        }
      }
    }
    return res;
  }
  
  public ArrayList<TreeNode> generateTrees(int n) {
      return helper(1, n);      
  }
}
