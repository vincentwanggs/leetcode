public class SearchForRange{
  public int[] searchRange(int[] A, int target) {
   int[] ret = new int[2];
    ret[0] = -1;
    ret[1] = -1;
    
    // make sure the element exists in the array
    int low = 0;
    int high = A.length - 1;
    int hit = -1;
    while (low <= high){
      int mid = (low+high)/2;
      if (A[mid] == target){
        hit = mid;
        break;
      }
      if (A[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }
    
    if (hit == -1)
      return ret;
    
    low = 0;
    high = hit;
    
    // now all elements between[low, high] is smaller or equal to the target
   //  // from the found position, go left to find the lower bound
    while (low <= high){
      int mid = (low+high)/2;
      if (A[mid] == target) 
        high = mid - 1;      
      else
        low = mid + 1;
    }
    ret[0] = low;
   
    // go right to find the upper bound
    low = hit; high = A.length - 1;
    while (low <= high){
      int mid = (low+high)/2;
      if (A[mid] == target)
        low = mid + 1;
      else 
        high = mid - 1;
    }
    ret[1] = high;
    return ret;
    
  }
}
