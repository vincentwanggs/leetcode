public class InterleaveString{
  public boolean isInterleave(String s1, String s2, String s3) {
    boolean [][] interleave = new boolean[s1.length()+1][s2.length()+1];// whether s3[i+j] can be obtained from s1[i]+s2[j]
    
     if (s3.length() != s1.length() + s2.length())
        return false;    
    interleave[0][0] = true;
    
    for (int i = 1; i <= s1.length(); i ++)
      if (s1.charAt(i-1) == s3.charAt(i-1))
        interleave[i][0] = true;
    for (int j = 1; j <= s2.length(); j ++)
      if (s2.charAt(j-1) == s3.charAt(j-1))
        interleave[0][j] = true;
        
    for (int i = 1; i <= s1.length(); i ++){
      for (int j  = 1; j <= s2.length(); j ++){
        if (interleave[i-1][j] && s3.charAt(i+j-1)==s1.charAt(i-1) || interleave[i][j-1] && s3.charAt(i+j-1)==s2.charAt(j-1))
          interleave[i][j] = true;
      }
    }
    return interleave[s1.length()][s2.length()];
  }
}
