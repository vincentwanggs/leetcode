public class LastWordLength{
  public int lengthOfLastWord(String s) {
       s = s.trim(); // remove the leading and trailing spaces
      
      int length = 0;
      for (int i = 0; i < s.length(); i ++){
        char ch = s.charAt(i);
        if (ch == ' '){
          while (ch == ' '){
             i++;
            ch = s.charAt(i);
          }
          length = 1;
        }
        else{
          length ++;
        }
      }
       return length; 
  }
}
