
// Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

public class MaximumSubarray{

    public int maxSubArray(int[] A) {
      
      int max = 0;
      int cur_max = 0;
      
      for (int i = 0; i < A.length; i ++){
        if (A[i] >= 0){
          if (cur_max+A[i] > max){
            max = cur_max+A[i];
            cur_max = max;
          }
        }
        else{
          cur_max = 0;
        }
      }
    }
}
