import java.io.*;
import java.utils.*;

public class LinkedListCycle{
  public ListNode detectCycle(ListNode head) {
    
    if (head == null || head.next == null)
        return null;
    ListNode slow = head;
    ListNode fast = head;
    
    // test whether there is cycle or not
    while (fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if (fast == null)
            return null;
        if (slow == fast)
            break;
    }
    
    // now we need to find the start of the cycle
    // now slow and fast met at the meeting point
    
    fast = head;    // move one pointer to the head
    
    while (fast != slow){
        fast = fast.next;
        slow = slow.next;
    }
    
    return fast;    
  }
}
