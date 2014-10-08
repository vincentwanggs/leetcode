public class WildCardMatch{
/*
'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
*/
  public boolean isMatch(String s, String p) {
      int si = 0;  // index to s
      int pi = 0; // index to p
      
      int ss = -1; // last matched position of s before the *
      int ps = -1; // 
      
      while (si < s.length()){
      
        // match one symbol
        if (si < s.length() && pi < p.length() && s.charAt(si) == p.charAt(pi)){
          si ++; pi ++; continue;
        }
      
        if (si < s.length() && pi < p.length() && p.charAt(pi) == '?'){
          si ++; pi ++; continue;
        }
        // encountering a star
        if (si < s.length() && pi < p.length() && p.charAt(pi) == '*'){
          ss = si; // record the last matched position before the star
          ps = pi;
          pi ++; // move p to the next symbol
          continue;
        }
        // match star to string s until another match 
        if (ps != -1 && ps < p.length()){ si = ss; ss++;  pi = ps + 1; conitnue;}
        return false;
      }
      
      // now we have consumed all the chars in s
      while (pi < p.length() && p.charAt(pi) == '*'){
        pi ++;
      }
      return pi = p.length();
  }
}
