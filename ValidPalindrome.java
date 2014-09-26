public class ValidPalindrome{
  public boolean isPalindrome(String s) {
  
  s = s.trim().toLowerCase();
    StringBuffer res = new StringBuffer();
    for (int i = 0; i < s.length(); i ++){
      char ch = s.charAt(i);
      if (ch >= '0' && ch <= '9' || ch >='a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        res.append(ch);
    }
    
    return res.toString().equals(res.reverse().toString());
  }
}
