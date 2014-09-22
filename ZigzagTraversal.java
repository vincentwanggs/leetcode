public class ZigzagTraversal{
  
  public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
      
      if (root == null)
        return res;
        
      ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
      ArrayList<Integer> vals = new ArrayList<Integer>();
      queue.add(root);
      
      int currentLevel = 1;
      int nextLevel = 0;
      
      int level = 0;
      while (queue.size() >  0){
        
        TreeNode n = queue.get(0);
        queue.remove(n);
        currentLevel --;
        if (n != null){
          vals.add(n.val);
          queue.add(n.left);
          queue.add(n.right);
          nextLevel += 2;
        }
        
        if (currentLevel == 0){
          // we have finished the current level
          if (vals.size() > 0){
            if (level % 2 != 0)
              Collections.reverse(vals);
            res.add(vals);
          }
            vals = new ArrayList<Integer>();
            currentLevel = nextLevel;
            nextLevel = 0;
            level ++;
        }
        
      }
      
      return res;
            
  }

}
