public class UniquePathsII{
  
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      
      boolean firstRowBlocked = false;
      boolean firstColBlocked = false;
      
      int m = obstacleGrid.length;
      int n = obstacleGrid[0].length;
      
      int[][] res = new int[m][n];
      
      for (int i = 0; i < n; i ++){
        if (obstacleGrid[0][i] == 1)
          firstRowBlocked = true;
        if (!firstRowBlocked)
          res[0][i] = 1;
      }
      
      for (int i = 0; i < m; i ++){
         if (obstacleGrid[i][0] == 1)
          firstColBlocked = true;
        if (! firstColBlocked){
          res[i][0] = 1;
        }
      }
      
      // now fill the table
      for (int i = 1; i < m; i ++){
        for (int j = 1; j < n; j ++){
          if (obstacleGrid[i][j] == 0){
            res[i][j] = res[i-1][j] + res[i][j-1];
          }
        }
      }
      return res[m-1][n-1];  
  }
}
