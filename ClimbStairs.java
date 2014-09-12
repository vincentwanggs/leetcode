// store the previously computed result to save time
// solved by dynamic programming

public class ClimbStairs{

    public int climbStairs(int n) {
      
      if (n <= 2)
            return n;
      // initialisation of an array to store the number of ways to climb to level n stairs
      
      int[] steps = new int[n+1];
      steps[1] = 1;
      steps[2] = 2;
      
      for (int i = 3; i <= n; i ++){
      // steps[i-1] is the number of steps if the last operation to level i is one step
      // steps[i-2] is the number of steps if the last operation to level i is two steps
        steps[i] = steps[i-1] + steps[i-2];
      }
      
      return steps[n];
    }
}
