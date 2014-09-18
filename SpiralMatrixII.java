public class SpiralMatrixII{

  public int[][] generateMatrix(int n) {
    
    public int[][] generateMatrix(int n) {
        int layer = n/2;
    int[][] num = new int[n][n];
    if (n == 0)
        return num;
    if (n == 1){
            num[0][0] = 1;
            return num;
        }
    int count = 1;
    for (int i = 0; i < layer; i ++){
      // print layer by layer
      int eleNum = n - i - 1;
      
      // go right
      for (int j = i; j <= eleNum; j ++)
        num[i][j] = count ++;
      // go down
      for (int j = i + 1; j <= eleNum; j ++)
        num[j][n - i - 1] = count ++;
      // go left
      for (int j = n-1-i-1; j >= i; j --)
        num[n-i-1][j] = count ++;
      // go up
      for (int j = n-1-i-1; j >= i + 1; j --)
        num[j][i] = count ++;
    }
    if (n %2 == 1)
        num[layer][layer] = n*n;    
  return num;
    }
}
