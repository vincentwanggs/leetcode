public class MinimumWinSubstring{
  public String minWindow(String S, String T) {
    if (S.length() < T.length())
      return "";
    HashMap<Character, Integer> found = new HashMap<Character, Integer>();
    HashMap<Character, Integer> required = new HashMap<Character, Integer>();
    for (int i = 0; i < T.length(); i ++){
        char ch = T.charAt(i);
        found.put(ch,0);
        if (required.containsKey(ch)){
            required.put(ch,required.get(ch)+1);
        }
        else
            required.put(ch,1);
    }
    
    int len = 0;
    int head = 0;
    int min_left = -1;
		int min_right = S.length();
    for (int i = 0; i < S.length(); i ++){
      char ch = S.charAt(i);
      if (required.containsKey(ch)){
        found.put(ch,found.get(ch)+1);
        if (found.get(ch) <= required.get(ch))
          len ++;
          
        if (len == T.length()){
        // we have a window of all the chars in T
          char cur = S.charAt(head);
          while (!required.containsKey(cur) || found.get(cur) > required.get(cur)){
            if (found.containsKey(cur))
              found.put(cur,found.get(cur)-1);  
            head ++;
            cur = S.charAt(head);
          }
          if (i - head < min_right - min_left){
            min_right = i;
            min_left = head;
          }
            
        }
      }
      
    }
    if (min_left != -1){
			return S.substring(min_left, min_right+1);
		}
		else 
			return "";
    }
  }
}
