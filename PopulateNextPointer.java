import java.io.*;
import java.utils.*;

public class PopulateNextPointer{

  public void connect(TreeLinkNode root) {
       if (root == null || root.left == null) return;
    //  root.left.next = root.right;
      TreeLinkNode leftMost =root;
      while (leftMost.left != null){
        TreeLinkNode levelStart = leftMost;
        while (levelStart != null){
          levelStart.left.next = levelStart.right;
          levelStart.right.next = (levelStart.next == null)?null:levelStart.next.left;
          levelStart = levelStart.next;
          }
        leftMost = leftMost.left;
      }
    }

}
