//
public class SortedArray2BST{

  public TreeNode sortedArrayToBST(int[] num, int low, int high) {
      if (low > high)
        return null;
      int mid = (low+high)/2;
      TreeNode node = new TreeNode(num[mid]);
      node.left = sortedArrayToBST(num, low, mid -1);
      node.right = sortedArrayToBST(num, mid+1, high);
      return node;
  }
  
  public TreeNode sortedArrayToBST(int[] num) {
      if(num == null || num.length == 0)
        return null;
      return sortedArrayToBST(num, 0, num.length-1);
  }
}
