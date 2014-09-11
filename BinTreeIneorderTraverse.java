import java.io.*;
import java.utils.*

public class BinTreeIneorderTraverse{

  public ArrayList<Integer> inorderTraversal(TreeNode root) {
      
      ArrayList<Integer> ret = new ArrayList<Integer>();
      if (root == null) return ret;
      Stack<TreeNode> nodes = new Stack<TreeNode>();
      TreeNode current = root;
      while (!nodes.isEmpty() || current != null){
      
        if (current != null){
          nodes.push(current);
          current = current.left;
        }
        else {
          current = nodes.pop();
          ret.add(current.val);
          current = n.right;
        }
      }
      return ret;  
  }
}
