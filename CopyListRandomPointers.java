public class CopyListRandomPointers{
  
  public RandomListNode copyRandomList(RandomListNode head) {
       if (head == null)
        return head;
     
      HashMap<RandomListNode, RandomListNode> node2new = new HashMap<RandomListNode, RandomListNode>();
      RandomListNode newHead = new RandomListNode(head.label);
      node2new.put(head, newHead);
      RandomListNode nHead = newHead;
      RandomListNode cur = head.next;
      // copy the next pointers
      while (cur != null){
       RandomListNode copy = new RandomListNode(cur.label);
       node2new.put(cur,copy);
       nHead.next = copy;
       nHead = nHead.next;
       cur = cur.next;
      }
      
      cur = head;
      nHead = newHead;
      while (cur != null){
        if (cur.random != null){
          nHead.random = node2new.get(cur.random);
        }
        else
          nHead.random = null;
      cur = cur.next;
      nHead = nHead.next;
      }
      return newHead;
      
  }
}
