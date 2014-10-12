public class ScrambleString{
  
  public boolean isScramble(String s1, String s2) {
    if (s1.equals(s2))
      return true;
      
    if (s1.length() != s2.length())
      return false;
       char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(!Arrays.equals(c1, c2)) return false;
    boolean result = false;
    for (int i = 1; i < s1.length() && !result; i ++){
      // now we divide s1 into binary trees at each possible location
      String s11 = s1.substring(0,i);
      String s12 = s1.substring(i);
      
      String s21 = s2.substring(0,i);
      String s22 = s2.substring(i);
      
      String s31 = s2.substring(0, s2.length() - i);
      String s32 =s2.substring(s2.length() - i);
      
      result = isScramble(s11,s21) && isScramble(s12,s22)
               || isScramble(s11,s32) && isScramble(s12,s31);
    }
    return result;
    }
  }
}
