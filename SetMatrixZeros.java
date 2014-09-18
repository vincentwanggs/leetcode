public class SetMatrixZeroes{
  public void setZeroes(int[][] matrix){
		//use the first row and col to store the rows and cols that contain zeros
		int m = matrix.length;
		int n = matrix[0].length;
		
		boolean firstRowZero = false;
		boolean firstColZero = false;
		
		for (int i = 0; i < m; i ++)
			if (matrix[i][0] == 0)
				firstColZero = true;
				
		for (int j = 0; j < n; j ++)
			if (matrix[0][j] == 0)
				firstRowZero = true;
				
		for (int i = 1; i < m; i ++){
			for (int j = 1; j < n; j ++){
				if (matrix[i][j] == 0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < m; i ++){
			if (matrix[i][0] == 0){
				for (int j = 1; j < n; j ++){
					matrix[i][j] = 0;
				}
			}
		}
		for (int j = 1; j < n; j ++){
			if (matrix[0][j] == 0){
				for (int i = 1; i < m; i ++){
					matrix[i][j] = 0;
				}
			}
		}
	
		if (firstRowZero){
			for (int j = 0; j < n; j ++){
				matrix[0][j] = 0;
			}
		}
		if (firstColZero){
			for (int i = 0; i < m; i ++){
				matrix[i][0] = 0;
			}
		}
	}
}
