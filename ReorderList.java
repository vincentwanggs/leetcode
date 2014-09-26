public class ReorderList{
  public void reorderList(ListNode head) {
      // go to the middle of the list
     if (head == null || head.next == null)
        return;
     ListNode fast = head;
     ListNode slow = head;
    // ListNode pre = null;
     while (fast != null && fast.next != null){
 //     pre = slow;
      slow = slow.next;
      fast = fast.next.next;
     }
     // now slow is in the middle of the list
     
     ListNode secondHalf = slow.next;
     slow.next = null;
     
     // reverse the second half
     
     ListNode reverseH = null;
     ListNode cur = secondHalf;
     
     while (cur != null){
      ListNode next = cur.next;
      cur.next = reverseH;
      reverseH = cur;
      cur = next;
     }
     ListNode dummy = new ListNode(0);
     cur = dummy;
     // weave the two sublists
     while (head != null && reverseH != null){
     
        ListNode hNext = head.next;
        ListNode rNext = reverseH.next;
        cur.next = head;
        cur = cur.next;
        cur.next = reverseH;
        cur = cur.next;
        
        head = hNext;
        reverseH = rNext;
     }
     if (head != null)
      cur.next = head;
     if (reverseH != null)
      cur.next = reverseH;
    
      head = dummy.next;
  }
}
