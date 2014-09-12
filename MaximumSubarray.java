
// Find the contiguous subarray within an array (containing at least one number) which has the largest sum.


public class MaximumSubarray{

    public int maxSubArray(int[] A) {
      
      // note the condition that the subarray contains at least one element
      int max = A[0];
      int cur_max = A[0];
      
      for (int i = 1; i < A.length; i ++){
          cur_max = Math.max(cur_max+A[i], A[i]);
          if (cur_max > max){
            max = cur_max;
          }
    
       
      }
    }
}
