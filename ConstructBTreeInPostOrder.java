public class ConstructBTreeInPostOrder{
  public TreeNode buildTree(int[] inorder, int[] postorder) {
      HashMap<Integer,Integer> inOrderVal2Index = new HashMap<Integer,Integer> ();
		  // a hash map from a value to its index in the inorder sequence
		  for (int i = 0; i < inorder.length; i ++){
		            inOrderVal2Index.put(inorder[i],i);
		  }  
	  TreeNode root = helper(postorder, 0, inorder.length-1, 0, postorder.length-1,inOrderVal2Index);
	  return root;
  }
  
  // use inStart and inEnd to define the interval of a subtree
  public TreeNode helper(int[] postorder, int inStart, int inEnd, int postStart, int postEnd, HashMap<Integer,Integer> inOrderVal2Index){
  
    if (inStart > inEnd || postStart > postEnd)
      return null;
    int rootVal = postorder[postEnd];
    TreeNode root = new TreeNode(rootVal);
    
    int index = inOrderVal2Index.get(rootVal);
    
    int sizeOfSubTree = index - inStart - 1;
    
    root.right = helper(postorder, index + 1, inEnd, postStart+sizeOfSubTree+1, postEnd - 1, inOrderVal2Index);
    root.left = helper(postorder, inStart, index - 1, postStart, postStart + sizeOfSubTree, inOrderVal2Index);
    return root;
  }

}
