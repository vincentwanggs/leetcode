public class RemoveNthFromEnd{
  public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
			return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = head;
		int count = 0;
		while (count < n){
			cur = cur.next;
			count ++;
		}
		ListNode pre = dummy;
		// now the distance between head and cur is N, we move cur until it is the end of the list
		ListNode tail = cur;
		while (tail != null){
			tail = tail.next;
			head = head.next;
			pre = pre.next;
		}
		pre.next = head.next;
		return dummy.next;
    }
}
