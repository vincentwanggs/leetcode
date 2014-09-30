public class SubstringWithAllWords{
  public ArrayList<Integer> findSubstring(String S, String[] L) {
    
    HashMap<String,Integer> required = new HashMap<String, Integer>();
    HashMap<String,Integer> found = new HashMap<String, Integer>();
     ArrayList<Integer> res = new  ArrayList<Integer> ();
    int len = L[0].length();
    for (int i = 0; i < L.length; i ++){
      if (!required.containsKey(L[i]))
        required.put(L[i],1);
      else
        required.put(L[i], required.get(L[i])+1);
      found.put(L[i],0);
    }
    
    // now we scan S to find all the words
    for (int i = 0; i <= S.length() - len*L.length; i ++){
     
      for (int j = 0; j < L.length; j ++){
         String cur = S.substring(i+j*len, i + (j+1)*len);
         if (!required.containsKey(cur))
            break;
         found.put(cur, found.get(cur) + 1);
      }
      // now we compare found and required
      Iterator<String> it = required.keySet().iterator();
      boolean matched = true;
    while (it.hasNext()){
        String key = it.next();
        if (found.get(key)!=required.get(key))
          matched = false;
        found.put(key,0);
      }
      if (matched)
        res.add(i);
    }
    return res;
  
        
  }
}
