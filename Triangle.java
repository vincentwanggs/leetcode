public class Triangle{
  //Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
  
  public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
    // typical DP problem, the relation is
    // min[i][j] = Math.min(min[i-1][j-1],min[i-1][j])+A[i][j]
    
    // a matrix to save the min sum up to the current cell
    int[][] min = new int [triangle.size()][triangle.get(triangle.size()-1).size()];
    
    min[0][0] = triangle.get(0).get(0);
    
    for (int i = 1; i < triangle.size(); i ++){
      ArrayList<Integer> row = triangle.get(i); // get the i-th row
      ArrayList<Integer> lastRow = triangle.get(i-1); // get the last row
      
      for (int j = 0; j < row.size(); j ++){
        
        int tmp1 = (j>=1)?min[i-1][j-1]:0;
         
        min[i][j] = Math.min(tmp1, min[i-1][j]) + row.get(i).get(j);
        
      }
      
    }
    
    // find the min value in the last row and return
    int last = triangle.size()-1;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < triangle.get(last).size(); i ++){
      if (min[last][i] < min)
        min = min[last][i];
    }
    return min;  
  }
}
