// Given an array with n objects colored red, white or blue, 
// sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

// Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

public class SortColors{

 private void swap(int[] A, int i, int j){
      int tmp = A[i];
      A[i] = A[j];
      A[j] = tmp;
  }

  public void sortColors(int[] A) {
      
      int red = 0;
      int blue = A.length - 1;
      
      while (red < A.length && A[red]==0 ) {red++;}
      while (blue >= 0 && A[blue]==2 ) {blue--;}
      
      int cur = red;
      
      while (cur <= blue){
        if (A[cur] == 0 && cur >= red){
          // swap red and cur
          swap(A,red,cur);
          red ++;
        }
        else if (A[cur] == 2){
          swap(A,blue,cur);
          blue --;
        }
        else
            cur ++;
  }
}
}
