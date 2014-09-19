public class LongestConsecutiveSeq{
  public int longestConsecutive(int[] num) {
    // Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
    
    HashMap<Integer,Integer> num2neigh = new HashMap<Integer,Integer>();
    int ret = 0;
    for (int i = 0; i < num.length; i ++)
      num2neigh.put(num[i],1);
    for (int i = 0; i < num.length; i ++){
      int cur = num[i];
      
      // go right
      int max = 1;
      while (num2neigh.containsKey(cur + 1)){
        num2neigh.remove(cur+1);
        cur ++;
        max ++;
      }
      
      cur = num[i];
      while (num2neigh.containsKey(cur - 1)){
        num2neigh.remove(cur-1);  
        cur --;
        max ++;
      }
      if (max > ret)
        ret = max;
    }
    return ret;
  }
}
