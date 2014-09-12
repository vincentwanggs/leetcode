pulic class RemoveDuplicates{

  public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ListNode cur = head;
        
        while (cur != null){
          ListNode next = cur.next;
          while ( next != null && next.val == cur.val){
            next = next.next;
          }
          cur.next = next;
          cur = cur.next;
        }
        
        return head;
    }
}
