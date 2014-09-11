import java.io.*;
import java.utils.*;

public class BinTreePreorderTraverse{

// binary tree preorder traverse, non-recursive

  public ArrayList<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root == null) return ret;
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);
        while (!nodes.isEmpty()){
          TreeNode n = nodes.pop();
          ret.add(n.val);
          if (n.right != null)
            nodes.push(n.right);
          if (n.left != null)
            nodes.push(n.left);
        }
        return ret;
    }
}
