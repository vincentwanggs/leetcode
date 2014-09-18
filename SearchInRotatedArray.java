public class SearchInRotatedArray{
  public int search(int[] A, int target) {
  
    int low = 0;
    int high = A.length - 1;
    while (low <= high){
      int mid = (low+high)/2;
      if (A[mid] == target)
        return mid;
      if (A[mid] >= A[low]){// low to mid is sorted
        if (target < A[mid] && target >= A[low])
          high = mid - 1;
        else
          low = mid + 1;
      }
      else{// rotate index is between mid and low
        if (target > A[mid] && target <= A[high])
          low = mid + 1;
        else
          high = mid - 1;
      }
    }
    return -1;    
  }
}
