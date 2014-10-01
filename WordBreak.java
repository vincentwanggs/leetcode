public class WordBreak{

  public boolean wordBreak(String s, Set<String> dict) {
      
      // a boolean array recording whether the string can be broken at the current index
      boolean[] canBreak = new boolean[s.length()+1];
      canBreak[0] = true;
      
      for (int i = 0; i < s.length(); i ++){
        if (!canBreak[i]) continue;
        
        for(String a: dict){
          int len = a.length();
          if ( i + len > s.length() || canBreak[i+len])
            continue;
          if (s.substring(i,i+len).equals(a))
            canBreak[i+len] = true;
        }
        
        
      }
      return canBreak[s.length()];  
  }

}
