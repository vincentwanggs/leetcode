public class RemoveDuplicatesII{

  public ListNode deleteDuplicates(ListNode head) {
    
    if (head == null || head.next == null)
            return head;
    ListNode dummy = new ListNode(Integer.MAX_VALUE);
    dummy.next = head;
    
    ListNode pre = dummy;
     ListNode cur = head;
    
    while (cur != null){
      
      ListNode next = cur.next;
      if (next == null)
        return dummy.next;
      if (cur.val == next.val){
        while (next != null && cur.val == next.val){
            next = next.next;
        }
        pre.next = next;
       // pre = pre.next;
        cur = next;
      }
      else{
          pre = cur;
          cur = cur.next;
      }
      
    }
    
    return dummy.next;
        
  }

}
