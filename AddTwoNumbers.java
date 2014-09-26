public class AddTwoNumbers{
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      ListNode head = new ListNode(0);
      ListNode cur = head;
      int carrier = 0;
      while (l1 != null || l2 != null){
        int op1 = (l1==null)?0:l1.val;
        int op2 = (l2==null)?0:l2.val;
        int digit = (op1+op2+carrier)%10;
        carrier = (op1+op2+carrier)/10;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
        ListNode sum = new ListNode(digit);
        cur.next = sum;
        cur = cur.next;
      }
      if (carrier > 0)
        cur.next = new ListNode(carrier);
      return head.next;
        
  }
}
