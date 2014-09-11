public class BinTreePostorderTraverse{

 public ArrayList<Integer> postorderTraversal(TreeNode root) {
      
      ArrayList<Integer> ret = new ArrayList<Integer> ();
      if (root == null) return ret;
      Stack<TreeNode> nodes = new Stack<TreeNode>();
      
      nodes.push(root);
      
      TreeNode pre = null; // a pointer to indicate the previous visited node
      
      // there are three cases when we do the postorder traversing
      // 1) down the tree
      // 2) traversing up from the left subtree
      // 3) traversing up from the right subtree
      
      // to decide which direction we are now in, we need a pointer to record the previous node
      while (!nodes.isEmpty()){
        TreeNode n = nodes.peek();
        if (pre == null || pre.left == n || pre.right == n){
            // we are traversing down the tree
            if (n.left != null)
                nodes.add(n.left);
            else if (n.right != null){
                nodes.add(n.right);
            }
            else{
                ret.add(nodes.pop().val);
            }
        }
        else if (pre == n.left){
            // we are traversing up the tree from the left
            if (n.right != null)
                nodes.add(n.right);
            else{
                ret.add(nodes.pop().val);
            }
        }
        else if (pre == n.right){
            // we are traversing up the tree from the right tree
            ret.add(nodes.pop().val);
        }
        pre = n;
      }
      return ret;
      
    }
    
}
