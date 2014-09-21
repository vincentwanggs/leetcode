public class ValidSudoku{
  public boolean isValidSudoku(char[][] board) {
      // check for every row
      for (int i = 0; i < 9; i ++){
        HashSet<Character> row = new HashSet<Character>();
        for (int j = 0; j < 9; j ++){
        if (board[i][j] == '.')
            continue;
          if (board[i][j] > '9' || board[i][j] < '0')
            return false;
          if (row.contains(board[i][j]))
            return false;
          else
            row.add(board[i][j]);
        }
      }
      // check for every col
      for (int j = 0; j < 9; j ++){
        HashSet<Character> col = new HashSet<Character>();
        for (int i = 0; i < 9; i ++){
        if (board[i][j] == '.')
            continue;
          if (board[i][j] > '9' || board[i][j] < '0')
            return false;
          if (col.contains(board[i][j]))
            return false;
          else
            col.add(board[i][j]);
        }
      }
      // check for each 3X3 cell
      for (int i = 0; i < 3; i ++){ 
        for (int j = 0; j < 3; j ++){
          int row = i*3;
          int col = j * 3;
          HashSet<Character> cell = new HashSet<Character>();
          for (int k = 0; k < 3; k ++){
            for (int m = 0;m < 3; m ++){
              if (board[k+row][m+col] == '.')
                continue;
              if (board[k+row][m+col] > '9' || board[k+row][m+col] < '0')
                return false;
              if (cell.contains(board[k+row][m+col]))
                return false;
              else
                cell.add(board[k+row][m+col]);
            }
          }
        }
      }
      
      return true;
  }
}
