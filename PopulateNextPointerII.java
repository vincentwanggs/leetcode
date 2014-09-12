public class PopulateNextPointerII{

    public void connect(TreeLinkNode root) {
        
      if (root == null) return;
      
      TreeLinkNode currentLevelHead = root;
      TreeLinkNode nextLevelHead = (root.left == null)?root.right:root.left;
      
      while (nextLevelHead != null){
      
      // we chain all the non-null nodes in the next level and then move the nextlevel pointer downwards
      
      
      TreeLinkNode head = new TreeLinkNode(0);  // keep the head as the head of the nextlevel
      
      TreeLinkNode chain = head;
      
      while (currentLevelHead != null){
        if (currentLevelHead.left != null){
          head.next = currentLevelHead.left;
          head = head.next;
          }
         if (currentLevelHead.right != null){
          head.next = currentLevelHead.right;
          head = head.next;
          }
        currentLevelHead = currentLevelHead.next;
      }
      
      // now we need to find the next level starting point
      nextLevelHead = chain.next;
      }
        
    }

}
