public class InsertionSortListII{
  public ListNode insertionSortList(ListNode head) {
    // insertion sort: given current index, insert the next element into correct positions before index
    if (head == null || head.next == null)
      return head;
    
    ListNode cur = head;
    
    ListNode sorted = new ListNode(0);
    
    sorted.next = head;
    cur = head.next;
    head.next = null;
    
    while (cur != null){
    // insert the cur element into the correct position
      ListNode next = cur.next;
      
      ListNode pre = sorted;
      ListNode h = sorted.next;
      
      while (h != null && cur.val > h.val){
        h = h.next; // go to the next position
        pre = pre.next;
      }
      
      // insert the cur element into the correct position
      cur.next = h;
      pre.next = cur;
      
      // go to the next position
      cur = next;
    }
    return sorted.next;
  }
} 
