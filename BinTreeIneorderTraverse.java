import java.io.*;
import java.utils.*

public class BinTreeIneorderTraverse{

  public ArrayList<Integer> inorderTraversal(TreeNode root) {
      
      ArrayList<Integer> ret = new ArrayList<Integer>();
      if (root == null) return ret;
      Stack<TreeNode> nodes = new Stack<TreeNode>();
      nodes.push(root);
      TreeNode next = root.left;
      while (!nodes.isEmpty()){
      
        if (next != null){
          nodes.push(next);
          next = next.left;
        }
        else {
          TreeNode n = nodes.pop();
          ret.add(n.val);
          next = n.right;
        }
      }
      return ret;  
  }
}
