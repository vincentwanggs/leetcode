public class NQueens{
  
 public boolean canPut(int row, int col, int[] board){
    
    for (int i = 0; i < row; i ++){
      if (board[i] == col)
        return false;
      if (Math.abs(board[i] - col) == Math.abs(i-row))
        return false;
    }
    return true;
  }

public String[] board2Solution (int[] board){
  String[] res = new String[board.length];
  
  for (int i = 0; i < board.length; i ++){
    int col = board[i];
    StringBuffer tmp= new StringBuffer();
    for (int j = 0; j < col; j ++)
      tmp.append('.');
    tmp.append('Q');
    for (int j = col+1; j < board.length; j ++)
      tmp.append('.');
    res[i] = tmp.toString();
  }
  return res;
}
  public void getNQueens(int depth, int[] board, ArrayList<String[]> res){
    
    if (depth == board.length){
      // save the solution
      String[] solution = board2Solution(board);
      res.add(solution);
      return;
    }
    for (int i = 0; i < board.length; i ++){
      if (canPut(depth, i, board)){
        board[depth] = i;
        getNQueens(depth+1, board, res);
 //       board[depth] = -1;
      }
    }
  
  }
  public ArrayList<String[]> solveNQueens(int n) {
      int[] board = new int[n]; // an array to store the col of the queen on each row
      ArrayList<String[]> res = new ArrayList<String[]> ();
      getNQueens(0, board, res);
      return res;
    }
}
