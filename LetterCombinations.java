public class LetterCombinations{

  public void helper(int depth, String[] strings, StringBuffer solution, ArrayList<String> res){
  
    // depth is the digit position we are in 
    if (strings.length == solution.length()){
      res.add(solution.toString());
      return;
    }
    
    for (int i = depth; i < strings.length; i ++){
    // for all the chars in the current string of digit i
      for (int j = 0; j < strings[i].length(); j ++){
        solution.append(strings[i].charAt(j));
        helper(i + 1, strings, solution, res);
        solution.deleteCharAt(solution.length() - 1 );
      }
    }
  
  }

  public ArrayList<String> letterCombinations(String digits) {
    HashMap<Integer,String> digit2String = new HashMap<Integer,String>();
		ArrayList<String> res = new ArrayList<String> ();
		char ch = 'a';
		digit2String.put(9, "wxyz");
		digit2String.put(8, "tuv");
		digit2String.put(7, "pqrs");
		for (int i = 2; i <= 6; i ++){
			char[] chars = new char[3];
			for (int j = 0; j < 3; j ++){
				char newCh = (char)((int)ch + j);
				chars[j] = newCh;
			}
			ch = (char)((int)chars[2]+1);
			digit2String.put(i,String.valueOf(chars));
		}  
		char[] chars = digits.toCharArray();
		String[] strings = new String[chars.length];
		for (int i = 0; i < strings.length; i ++){
			strings[i] = digit2String.get(chars[i]-'0');
		}
		// now we have the mapping from digit to string, now do the DFS
		StringBuffer solution = new StringBuffer();
		helper(0,strings, solution, res);
		return res;
  }
}
