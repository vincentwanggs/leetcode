public class FirstMissingPositive{

public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
  public int firstMissingPositive(int[] A) {
      // Without using extra space, we will need A to act as a flag array, 
      // our aim is to move number i to index i-1, A[A[i]-1]==A[i] by swapping (A[i]-1)-th element with i-th element
      // in addition, we only consider the elements with value between 0 and A.length
      for (int i = 0; i < A.length; i ++){
         if ( (A[i]>0)&&(A[i]<= A.length)){
            while (A[i]-1 != i){
              if (A[i] > A.length || A[i] <= 0 || A[A[i]-1] == A[i])
                break;
              swap(A,A[i]-1,i);
            }
         }
      }
       for (int i = 0; i < A.length; ++i)
             if (A[i]-1 != i)
                 return i+1;
         return A.length+1;
  }
}
