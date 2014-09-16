public InsertionSortList{
  public ListNode insertionSortList(ListNode head) {
      // insertion sort: consume one element at one time, insert the element into appropriet position
      
      if (head == null || head.next == null)
        return head;
      
      ListNode sorted = head; // the head of the sorted list
      
      ListNode cur = head.next;
      
      while (cur != null){
        ListNode next = cur.next; // first save the next pointer
        if (cur.val < sorted.val){
          cur.next = sorted;
          sorted = cur;
        }
        else{// need to find a position between the sorted and cur to insert the current element
          ListNode pos = sorted;
          while (pos.next != null){
            if (pos == null || pos.val > cur.val){  // insert the current node
              cur.next = pos.next;
              pos.next = cur;
              break;
            }
            pos = pos.next;
          }
        }
        cur = next;
      }
      return sorted;
    }
}
