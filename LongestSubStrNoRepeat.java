public class LongestSubStrNoRepeat{
  public int lengthOfLongestSubstring(String s) {
  
    HashMap<Character,Integer> substring = new HashMap<Character,Integer>();
    
    int head = 0;   // the head of the current longest substring
    int max = 0;
    for (int i = 0; i < s.length(); i ++){
      char ch = s.charAt(i);
      if (substring.containsKey(ch)){
      // now we need to terminate a substring
        int index = substring.get(ch);
        int len = i - head;
        if (len > max)
          max = len;
        // now remove all the elements of the hash map
        for (int k = head; k <= index; k ++)
            substring.remove(s.charAt(k));
        substring.put(ch,i);
        head = index + 1;
      }
      else{
        substring.put(ch,i);
      }
    }
    return Math.max(max,substring.size());
        
  }
}
