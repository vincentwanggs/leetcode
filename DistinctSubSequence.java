public class DistinctSubSequence{
  /*
    r a b b b i t
  1 1 1 1 1 1 1 1
r 0 1 1 1 1 1 1 1
a 0 0 1 1 1 1 1 1
b 0 0 0 1 2 3 3 3
b 0 0 0 0 1 3 3 3
i 0 0 0 0 0 0 3 3
t 0 0 0 0 0 0 0 3  
  */
  
  public int numDistinct(String S, String T) {
  
  // a dp array to store the number of subsequence with length i from T to length of j in S
    int[][] res = new int[T.length()+1][S.length()+1];
    
    for (int j = 0; j < S.length()+1; j ++)
      res[0][j] = 1;
    
    for (int i = 1; i < T.length()+1; i ++){
      for (int j = 1; j < S.length() + 1; j ++){
        res[i][j] = res[i][j-1];  // the number of subsquences with length i of T in S with lenfth j
        if (S.charAt(j-1) == T.charAt(i-1))
          res[i][j] += res[i-1][j-1];
      }
    }
    return res[T.length()][S.length()];
  }
}
