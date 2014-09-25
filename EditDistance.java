public class EditDistance{
  
  public int minDistance(String word1, String word2) {
      int m = word1.length();
      int n = word2.length();
      
      int[][] cost = new int[m][n];
      
      for (int i = 0; i < m; i ++){
        cost[i][0] = i;
      }
      for (int j = 0; j < n; j ++){
        cost[0][j] = j;
      }
      
      for (int i = 1; i < m; i ++){
        for (int j = 1; j < n; j ++){
          int sub = 0;
          if (word1.charAt(i) != word2.charAt(j))
            sub = 1;
          cost[i][j] = Math.min(cost[i-1][j-1]+sub, Math.min(cost[i-1][j],cost[i][j-1])+1);
        }
      }
      return cost[m-1][n-1];
  }

}
