public class ReverseKGroups{
  public ListNode reverseKGroup(ListNode head, int k) {
      
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode cur = head;
      ListNode pre = dummy;
      while (cur != null){
        int index = 0;
        ListNode reverseH = null;  // the head of the reversed sublist
        ListNode reverseT = cur;//
        ListNode next = null;
        while (index < k){
          next = cur.next; // save the next pointer
          //cur = cur.next;
          cur.next = reverseH;
          reverseH = cur;
          cur = next;
          index ++;
        }
        
        // link the revesed sublist to the original list
        reverseT.next = cur;
        pre.next = reverseH;
        pre = reverseT;
        // test whether there are more than k elements left
        
        ListNode tail =  cur;
        for (int i = 0; i < k ; i ++){
                if (tail == null)
                    return dummy.next;
                tail = tail.next;
        }
      }
      return dummy.next;
      
  }
}
