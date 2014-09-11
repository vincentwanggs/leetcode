public class BinTreePostorderTraverse{

 public ArrayList<Integer> postorderTraversal(TreeNode root) {
      
      ArrayList<Integer> ret = new ArrayList<Integer> ();
      if (root == null) return ret;
      Stack<TreeNode> nodes = new Stack<TreeNode>();
      
      nodes.push(root);
      
      TreeNode current = root;
      
      while (!nodes.isEmpty()){
        if (current.left != null){
          current = current.left;
          nodes.push(current);
        }
        else if (current.right != null){
          current = current.right;
          nodes.push(current);
        }
        else{
          current = nodes.pop();
          ret.add(current.val);
          if (nodes.isEmpty())
            return ret;
          if (nodes.peek().right == current){
            ret.add(nodes.pop().val);
            current = nodes.peek().right;
          }
          else{
            current = nodes.peek().right;
          }
          if (current != null)
            nodes.push(current);
        }
      }
      return ret;
      
    }
    
}
