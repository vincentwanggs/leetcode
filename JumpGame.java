public class JumpGame{

  public boolean canJump(int[] A) {
     // int ret = false;
       int max = 0;
      
      for (int i = 0; i < A.length; i ++){
        if (i <= max){
        // this index can be accessed
          max = Math.max(max, i+A[i]);
          if (max >= A.length-1)
            return true;
        }
      }
      return false;
  }
}
