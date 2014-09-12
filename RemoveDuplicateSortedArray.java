public class RemoveDuplicateSortedArray{

//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
  public int removeDuplicates(int[] A) {
      
      int tail = 0;
        if (A == null) return 0;
        if (A.length < 2)
            return A.length;
            
      for (int i = 1; i < A.length; i ++){
        while (A[i] == A[tail]){
          i ++;
          if (i == A.length)
            return tail+1;
        }
        A[++tail] = A[i];
      }
      return tail+1;
  }
}
