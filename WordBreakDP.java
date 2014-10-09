public class WordBreakDP{
  public boolean wordBreak(String s, Set<String> dict) {
    boolean[] canBreak = new boolean[s.length()+1]; // whether the s.substring(0,i) can be broken into dictionary words
    
    canBreak[0] = true;
    
    for (int i = 1; i <= s.length(); i ++){
      for (int j = i; j > 0; j --){ // for all the substrings before i
        String substr = s.substring(j-1,i); // the substring from j to i
        if (dict.contains(substr) && canBreak[j-1]) // if s[0:j-1] can be broken, and s[j:i] is in the dictionary
          canBreak[i] = true;
      }
    }
    
    return canBreak[s.length()];
  }
}
