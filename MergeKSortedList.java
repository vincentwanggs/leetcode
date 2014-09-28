public class MergedSortedList{
  public ListNode mergeKLists(ArrayList<ListNode> lists) {
      int size = lists.size();
      if (size == 0)
          return null;
      return helper(lists, 0, size-1);  
  }
  public ListNode helper(ArrayList<ListNode> lists, int low, int high){
    while (low < high){
      int mid = (low+high)/2;
      ListNode first = helper(lists, low, mid);   // merge the first half
      ListNode second = helper(lists, mid+1, high); // merge the second half
      return merge(first,second);
    }
    return lists.get(low);
  }
  ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while (l1 != null){
            cur.next = new ListNode(l1.val);
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null){
            cur.next = new ListNode(l2.val);
            l2 = l2.next;
            cur = cur.next;
        }
        return dummy.next;
    }
}
