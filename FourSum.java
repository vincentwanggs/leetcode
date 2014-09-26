public class FourSum{
  public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
      Arrays.sort(num);
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
      for (int i = 0; i < num.length; i ++){
        int tgt = target - num[i];
        for (int j = i+1; j < num.length; j ++){
          
          int head = j + 1;
          int tail = num.length - 1;
          
          while (head < tail){
            
            if (num[head]+num[tail]+num[j] == tgt){
              ArrayList<Integer> sol = new ArrayList<Integer>();
              sol.add(num[i]); sol.add(num[j]); sol.add(num[head]); sol.add(num[tail]);
              res.add(sol);
              
              int h = num[head];
              int t = num[tail];
              while (head < tail && num[head] == h)
                head ++;
              while (head < tail && num[tail] == t)
                tail --;
            }
            else if (num[head]+num[tail]+num[j] < tgt){
              head ++;
            }
            else
              tail --;
          }
          
          while (j < num.length - 1 &&num[j] == num[j+1])
            j ++;
        }
         while (i < num.length - 1 &&num[i] == num[i+1])
            i ++;
      }
      return res;
  }
}
