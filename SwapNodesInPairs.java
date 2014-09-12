public class SwapNodesInPairs{

//Given a linked list, swap every two adjacent nodes and return its head.
//Given 1->2->3->4, you should return the list as 2->1->4->3.

  public ListNode swapPairs(ListNode head) {
      if (head == null || head.next == null)
        return head;
      
      ListNode dummy = new ListNode(0);
      dummy.next = head.next;
      
      ListNode pre = dummy;
      
      while (head != null && head.next != null){
        ListNode next = head.next.next;
        ListNode n = head.next;
         pre.next = n;
        n.next = head;
        head.next = next;
        head = next;
        pre = pre.next.next;
      }
      return dummy.next;
  }
}
