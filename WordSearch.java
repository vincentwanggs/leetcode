public class WordSearch{

  public boolean helper(int depth, String word, char[][] board, boolean[][] visited, int row, int col){
    
    if (row >= board.length || row < 0 || col >= board[0].length || col < 0)
      return false;
    if (visited[row][col])
      return false;
    if (board[row][col] != word.charAt(depth))
      return false;
    if (depth == word.length() - 1)
      return board[row][col] == word.charAt(depth);
    visited[row][col] = true;
    boolean res = helper(depth+1, word,board,visited, row, col+1)||helper(depth+1, word,board,visited, row, col-1)
                  || helper(depth+1, word,board,visited, row+1, col)|| helper(depth+1, word,board,visited, row-1, col);
     visited[row][col] = false;
     return res;
  }
  public boolean exist(char[][] board, String word) {
     int  m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i ++)
			for (int j = 0; j < n ; j ++)
				visited[i][j] = false;
		for (int i = 0; i < m; i ++)
			for (int j = 0; j < n; j ++){
				if (helper(0,word,board,visited,i,j))
					return true;
			}
		return false;   
  }
}
