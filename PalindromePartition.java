public class PalindromePartition{
  
  
  public boolean isPalindrome(String s){
    StringBuffer tmp = new StringBuffer(s);
    return tmp.reverse().toString().equals(s);
  }
  
  public void helper(int depth, String s, ArrayList<String> sol, ArrayList<ArrayList<String>> res){
    if (depth == s.length()){
      res.add(new ArrayList<String>(sol));
      return;
    }
    
    for (int i = depth+1; i <= s.length(); i ++){
      String str = s.substring(depth, i);
      if (isPalindrome(str)){
        sol.add(str);
        helper(i , s, sol, res);
        sol.remove(sol.size()-1);
      }
    }
    
  }
  
  public ArrayList<ArrayList<String>> partition(String s) {
      ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	 
	    if (s == null || s.length() == 0) {
		    return result;
	    }
	    ArrayList<String> solution = new ArrayList<String>();  
	    helper(0,s, solution, result);
	    return result;
  }

}
