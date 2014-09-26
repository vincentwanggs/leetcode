public class RotateList{
/*
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
*/
  public ListNode rotateRight(ListNode head, int n) {
      
      if (head == null || head.next == null)
        return head;
        int i = 0;
      ListNode tail = head;
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode pre = dummy;
      
      // get the length of the list
      int len = 0;
      while (head != null){
        head = head.next;
        len ++;
        if (head != null)
          tail = head;
      }
      head = dummy.next;
      if (n%len == 0)
		      return dummy.next;
	  n = len - n%len;
	  ListNode cur = dummy.next;
      while (i < n){
        pre = cur;
        cur = cur.next;
        i++;
      }
      dummy.next = cur;
      tail.next = head;
      pre.next = null;
      return dummy.next;
  }
}
