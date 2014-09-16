public class ReverseListII{
  public ListNode reverseBetween(ListNode head, int m, int n) {
      if (head == null || head.next == null)
        return head;
        
      // begin to find the index m
      
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      
      ListNode pre = dummy;
      
      ListNode cur = head;
      int index = 1;
      while (cur != null && index <= m ){
        cur = cur.next;
        index ++;
        pre = pre.next;
      }
      // now pre points to the position previous to m and cur1 points to position m
      // the reverse is done by intialising a new list and insert every element between m and n to the HEAD of the new reversed
      // list
      
     // ListNode reversed = pre;
      ListNode reversedH = null;  // the head of the reversed list

      ListNode reversedTail = cur;  // the tail of the reversed list would be the current node
      
      while (cur != null && m <= n){
        ListNode next = cur.next;  // keep the next pointer of the current node
       
       // insert cur1 to the head of the reversed list
        cur.next = reversedH;
        reversedH = cur;
        
        // move the cur to next
        cur = next;
        m ++;
      }
      
      // connect to the original list
      pre.next = reversedH;
      reversedTail.next = cur;
      
      return dummy.next;
  }
}
