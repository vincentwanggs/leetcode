public class SortList{
  public ListNode sortList(ListNode head) {
    
    // merge sort
    
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next;
    }
  
    // we need to break the list into halves  
    ListNode left = head;
    
    ListNode right = slow.next;
    
    slow.next = null;
  
    ListNode h1 = sortList(left);
		ListNode h2 = sortList(right);
		return mergeList(h1,h2);
        
  }
  public ListNode mergeList(ListNode left, ListNode right){

		ListNode merged = new ListNode(Integer.MAX_VALUE);
		ListNode dummyHead = merged;
		while (left != null && right != null){
			if (left.val >= right.val){
				ListNode tmp = new ListNode(right.val);
				dummyHead.next = tmp;
				right = right.next;
			}
			else{
				ListNode tmp = new ListNode(left.val);
				dummyHead.next = tmp;
				left = left.next;
			}
			dummyHead = dummyHead.next;
		}
		if (left == null){
			while (right != null){
				ListNode tmp = new ListNode(right.val);
				dummyHead.next = tmp;
				right = right.next;
				dummyHead = dummyHead.next;
			}
		}
		if (right == null){
			while (left != null){
				ListNode tmp = new ListNode(left.val);
				dummyHead.next = tmp;
				left = left.next;
				dummyHead = dummyHead.next;
			}
		}
		return merged.next;
	}
}
