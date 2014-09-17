public class SearchInRotatedArrayII{
  public boolean search(int[] A, int target) {
  
    int low = 0;
    int high = A.length - 1;
    while (low <= high){
      int mid = (low + high)/2;
      if (A[mid] == target)
        return true;
      if (A[mid] < A[low]){
        // the rotated index is between [low, mid]
          if (target > A[mid] && A[high] >= target){ // [mid,high] is increasing and A[high] is larger than the target
            low = mid + 1;
          }
          else{
            high = mid - 1;
          }
      }
      else if (A[mid] > A[low]){
        // [low, mid] is sorted
        if (target < A[mid] && A[low] <= target)
          high = mid - 1;
        else
          low = mid + 1;
      }
      else  // if A[mid] == A[low], we have nothing better to do rather than move to the next position
        low ++;
    }
    return false;
        
  }
}
