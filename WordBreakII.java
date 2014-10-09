public class WordBreakII{

    public static String list2String(ArrayList<String> solution){
    StringBuffer res = new StringBuffer();
    for (int i = 0; i < solution.size()-1; i ++)
      res.append(solution.get(i)+" ");
    res.append(solution.get(solution.size()-1));
    System.out.println(res);
    return res.toString();
  }

  public static void helper(int depth, String s, boolean[] canBreak, Set<String> dict, ArrayList<String> solution, ArrayList<String> res){
    
    if (depth == s.length()){
      res.add(list2String(solution));
      return;
    }
    
    for (int i = depth; i < s.length(); i ++){
      String word = s.substring(depth, i+1);
      if (dict.contains(word) && canBreak[i+1]){
        solution.add(word);
        helper(i+1, s, canBreak, dict, solution, res);
        solution.remove(solution.size()-1);
      }
    }
  
  }

  public static ArrayList<String> wordBreak(String s, Set<String> dict) {
    boolean[] canBreak = new boolean[s.length()+1]; // whether the substring with length i can be broken into dictionary words
    
    canBreak[0] = true;
    
    for (int i = 1; i <= s.length(); i ++){
      for (int j = i; j > 0; j --){ // for all the substrings before i
        String substr = s.substring(j-1,i); // the substring from j to i
        if (dict.contains(substr) && canBreak[j-1]) // if s[0:j-1] can be broken, and s[j:i] is in the dictionary
          canBreak[i] = true;
      }
    } 
    
    // now the information of whether substring with length i can be broken into words is stored in canBreak
    // we can now use this to prune the branches during DFS
    ArrayList<String> solution = new ArrayList<String> ();
    ArrayList<String> res = new ArrayList<String> ();
    helper(0,s,canBreak,dict,solution,res);
    return res;
  }
  
  public static void main(String[] args){
        String s = "catsanddog";
        HashSet<String> dict = new HashSet<String>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        ArrayList<String> res = new ArrayList<String>();
        res = wordBreak(s,dict);
        for (int i = 0; i < res.size(); i ++)
                System.out.println(res.get(i));
  }

  
}
