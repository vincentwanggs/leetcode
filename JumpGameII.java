public class JumpGameII{

  public int jump(int[] A) {
    
    int curLongest = 0;
    int longestSoFar = 0;
    int step = 0;
    
    for (int i = 0; i < A.length; i ++){
      // for each element in the array
      if (i > longestSoFar){
        longestSoFar = curLongest;
        step ++;
      }
      
      int reach = i + A[i];
      curLongest = Math.max(curLongest, reach);
    }
    return step;
  }
}
