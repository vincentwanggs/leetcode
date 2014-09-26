public ThreeSum{

  public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
       Arrays.sort(num);
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < num.length; i ++){
        int head = i + 1;
        int tail = num.length-1;
        
        while (head < tail){
          if (num[head]+num[tail]+num[i] == 0){
            ArrayList<Integer> sol = new ArrayList<Integer>();
            sol.add(num[i]); sol.add(num[head]); sol.add(num[tail]);
            res.add(sol);
             // now skip the same head and tail
            int h = num[head];
            int t = num[tail];
            while (head < tail && num[head] == h)
              head ++;
            while (tail > head && num[tail] == t)
              tail --;
          }
          else if (num[head]+num[tail]+num[i] < 0){
            head ++;
          }
          else
            tail --;
        }
        // skip the same i
        while (i < num.length-1 && num[i] == num[i+1])
          i ++;
     //   i --;
      }
    return res;
  }

}
