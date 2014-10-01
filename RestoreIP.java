public class RestoreIP{
/*
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]
*/

public int getLen(ArrayList<String> solution){
        int len = 0;
        for (int i = 0; i < solution.size(); i ++)
            len += solution.get(i).length();
        return len;
}
public void helper(int depth, String s, ArrayList<String> solution,   ArrayList<ArrayList<String>> res){

  if (depth == 4){
   int len = getLen(solution);
   if (len == s.length() && !res.contains(solution))
      res.add(new ArrayList<String> (solution));
    return;
  }
  
  // cut s into four segments
  for (int i = depth; i < 4; i ++){
    
    // each segment can be up to 3 chars
    for (int l = 1; l <= 3; l ++){
      int len = getLen(solution);  // number of chars that have been processed
      if (len + l > s.length())
        return;
      String cur = s.substring(len, len +l);
      if (cur.startsWith("0") && l > 1)
        return ;
      if (Integer.parseInt(cur) > 255)
        return;
      solution.add(cur);
      helper(depth + 1, s, solution, res);
      solution.remove(solution.size()-1);
    }
    
  }

}
  public ArrayList<String> restoreIpAddresses(String s) {
      ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>> ();
		ArrayList<String> solution = new ArrayList<String>();
		ArrayList<String> ret = new ArrayList<String>();
		helper(0,s,solution, res);
		for (int i = 0; i < res.size(); i ++){
			solution = res.get(i);
			String str = "";
			for (int j = 0; j < 4; j ++){
				if (j != 3)
					str += solution.get(j)+".";
				else
					str += solution.get(j);
			}
			ret.add(str);
		}
		return ret;  
  }
}
