public class UniquePaths{

  public int uniquePaths(int m, int n) {
      
      int[][] sol = new int[m+1][n+1];
      
      // initialisation
      
      for (int j = 1; j <= n; j ++)
        sol[m][j] = 1;
      for (int i = 1; i <= m; i ++)
        sol[i][n] = 1;
      
      for (int i = m-1; i > 0; i --){
        for (int j = n - 1; j > 0; j --){
          sol[i][j] = sol[i][j+1] + sol[i+1][j];
        }
      }
      
      return sol[1][1];  
    }
}
