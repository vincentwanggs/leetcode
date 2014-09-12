
// Given a sorted array and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

//You may assume no duplicates in the array.

// This is a typical binary search problem 

public class SearchInsertPosition{

  public int searchInsert(int[] A, int target) {
      int low = 0;
      int high = A.length - 1;
      
      while (low < high){
        int mid = (low+high)/2;
        if (A[mid] == target)
          return mid;
        if (A[mid] > target)
          high = mid - 1;
        else
          low = mid + 1;
      }
      
      return high + 1;
    }
}
