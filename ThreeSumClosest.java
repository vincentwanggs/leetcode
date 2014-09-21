public ThreeSumClosest{
  public int threeSumClosest(int[] num, int target) {
      Arrays.sort(num);
      
      // using the two pointers to solve this problem
      int head = 0;
   //   int tail = num.length - 1;
      int minDiff = Integer.MAX_VALUE; 
      
      int res = Integer.MAX_VALUE;
      
      for (int i = 0; i < num.length; i ++){
        head = i + 1;
        int sum = 0;
         int tail = num.length - 1;
        // scan from left to right
        while (head < tail){
          sum = num[i] + num[head] + num[tail];
          if (sum == target)
            return target;
          if (sum > target)
            tail --;
          else
            head ++;
        int diff = Math.abs(sum - target);
        if (diff < Math.abs(minDiff))
          minDiff = sum - target;
      }
        // skip the elements of num[i]
        while (i < num.length-1 && num[i+1] == num[i])
          i ++;
        if (Math.abs(minDiff) < Math.abs(res))
          res = minDiff;
      }
      return res + target;
  }
}
