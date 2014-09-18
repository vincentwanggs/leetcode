public class MinimumPathSum{
//Given a m x n grid filled with non-negative numbers, 
//find a path from top left to bottom right which minimizes the sum of all numbers along its path.

  public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] costs = new int[m][n];
    
    // costs[i][j] = min(costs[i-1][j], costs[i][j-1]) + grid[i][j]
    costs[0][0] = grid[0][0];
    
    for (int i = 1; i < m; i ++)
      costs[i][0] = costs[i-1][0] + grid[i][0];
    for (int j = 1; j < n; j ++)
      costs[0][j] = costs[0][j-1] + grid[0][j];
    
    for (int i = 1; i < m; i ++){
      for (int j = 1; j < n; j ++){
        costs[i][j] = Math.min(costs[i-1][j], costs[i][j-1]) + grid[i][j];
      }
    }
    
    return costs[m-1][n-1];
  }
}
