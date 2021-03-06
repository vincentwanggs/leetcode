//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.

public class MergeTwoLists{
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode head = new ListNode(0);
      ListNode dummmy = head;
      while (l1 != null || l2 != null){
        if (l1 == null){
          head.next = l2;
          l2 = l2.next;
        }
        else if (l2 == null){
          head.next = l1;
          l1 = l1.next;
        }
        else{
          if (l1.val > l2.val){
            head.next = l2;
            l2 = l2.next;
          }
          else{
            head.next = l1;
            l1 = l1.next;
          }
        }
        head = head.next;
      }
      
      return dummmy.next;
  }
}
