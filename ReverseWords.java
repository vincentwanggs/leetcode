public class ReverseWords{
  public String reverseWords(String s) {
    s = s.trim();
    
    ArrayList<String> res = new ArrayList<String>();
    StringBuffer word = new StringBuffer();
    for (int i = 0; i < s.length(); i ++){
      char ch = s.charAt(i);
      if (ch == ' '){
        res.add(word.toString());
        word = new StringBuffer();
        while (ch == ' '){
            i ++;
          ch = s.charAt(i);
        }
        i--;
      }
      else{
        word.append(ch);
      }
      
    }
    res.add(word.toString());
    StringBuffer ret = new StringBuffer();
    for (int i = res.size()-1; i > 0; i --)
        ret.append(res.get(i)+" ");
    ret.append(res.get(0));
    return ret.toString();
  }
}
