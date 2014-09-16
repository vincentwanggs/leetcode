public class PartitionList{
  
  public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
          return head;
        ListNode smaller = new ListNode (0);
        
        ListNode pre = new ListNode(0); // a previous pointer pointing to the start of the list
        ListNode greater = pre;         // it also serves as the start of the greater list
        
        
        ListNode dummy = smaller;
        
        pre.next = head;
        
        while (head != null){
          if (head.val < x){
            smaller.next = head;
            smaller = smaller.next;
            pre.next = head.next;
          }
          else{// current node has a value that is equal or larger than x
            pre = head;
          }
          head = head.next;
        }
        // now we connect the smaller list with the greater list
        smaller.next = greater.next;
        
        return dummy.next;
    }
}
