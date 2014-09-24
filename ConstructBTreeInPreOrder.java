public class ConstructBTreeInPreOrder {

public TreeNode buildTree(int[] preorder, int[] inorder) {
		        int len = inorder.length;
		        if (len == 0)
		            return null;
		        TreeNode root = new TreeNode(preorder[0]);
				HashMap<Integer,Integer> inOrderVal2Index = new HashMap<Integer,Integer>();
				for (int i = 0; i < inorder.length; i ++){
					inOrderVal2Index.put(inorder[i], i);
				}
				root = buildTreeRecurse(preorder, 0, preorder.length-1, 0, inorder.length-1,inOrderVal2Index);
				return root;
		    }
	 
	 public TreeNode buildTreeRecurse(int[] preorder, int preStart, int preEnd, int inStart, int inEnd,
			 HashMap<Integer,Integer> inOrderVal2Index){
		  if(inStart > inEnd || preStart > preEnd)
		            return null;
		  TreeNode root = new TreeNode(preorder[preStart]);
		  int index = inOrderVal2Index.get(preorder[preStart]);
		  int leftSize = index - inStart;
		   int rightSize = inEnd - index;
		  root.left = buildTreeRecurse(preorder, preStart + 1, preStart + leftSize, inStart, index-1, inOrderVal2Index);
		  root.right = buildTreeRecurse(preorder, preEnd - rightSize + 1, preEnd, index + 1, inEnd, inOrderVal2Index);
	    return root;
}
}
