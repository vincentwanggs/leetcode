public class SortList2BST{
  
   public static ListNode hd;
  public TreeNode sortedListToBST(ListNode head) {
        hd = head;
        // get the length of the list
        ListNode cur = head;
        int len = 0;
        while (cur != null){
          cur = cur.next;
          len ++;
        }
        return helper(0,len - 1);
  }
  
  public TreeNode helper(int low, int high){
    if (low > high)
      return null;
      
    int mid = (high+low)/2;
    TreeNode left = helper(low,mid-1);
    TreeNode root = new TreeNode (hd.val);
    root.left = left;
    hd = hd.next;
    TreeNode right = helper(mid+1,high);
    root.right = right;
    return root;
  }
  
}
