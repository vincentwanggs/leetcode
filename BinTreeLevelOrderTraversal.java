public class BinTreeLevelOrderTraversal{

  public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
       ArrayList<ArrayList<Integer>> ret = new  ArrayList<ArrayList<Integer>>();
       if (root == null)
        return ret;
       ArrayList<Integer> curLevel = new ArrayList<Integer>();
       ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
       nodes.add(root);
       int currentLevel = 1;
       int nextLevel = 0;
       
       while (!nodes.isEmpty()){
        TreeNode n = nodes.remove(0);
        currentLevel --;
        if (n != null){
          curLevel.add(n.val);
          nodes.add(n.left);
          nodes.add(n.right);
          nextLevel += 2;
        }
        
        if (currentLevel == 0){
          // finish one level
            if (curLevel.size() > 0)
              ret.add(curLevel);
            curLevel = new ArrayList<Integer>();
            currentLevel = nextLevel;
            nextLevel = 0;
        }
       }
      return ret;
        
    }

}
