//Given an array and a value, remove all instances of that value in place and return the new length.

public class RemoveElement{
  
  public int removeElement(int[] A, int elem) {
      if (A==null)  return 0;
      
      int head = 0;
      
      for (int i = 0; i < A.length; i ++){
        if (A[i] != elem){
          A[head++] = A[i];
        }
      }
      return head;
  }
}
