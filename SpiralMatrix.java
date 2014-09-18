public class SpiralMatrix{
  public ArrayList<Integer> spiralOrder(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		int layers = Math.min(m/2,n/2);
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for (int i = 0; i <= layers; i ++){
			if (res.size() == m*n)
			  return res;
			int layer = i;
			// go right
			for (int j = layer; j <= n - 1 - layer; j ++)
				res.add(matrix[i][j]);
				
			// go down
			for (int k = layer+1; k <= m-1-layer; k ++)
				res.add(matrix[k][n-1-layer]);
			
			// go left
			for (int j = n-layer-1; j >= layer; j --)
				res.add(matrix[m-1-layer][j]);
			
			// go up
			for (int k = m - 1 - layer; k >= layer+1; k --)
				res.add(matrix[k][layer]);
			
		}
		
		return res;
	}
}
