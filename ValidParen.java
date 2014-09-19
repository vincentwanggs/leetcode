public class ValidParen{

  public boolean match(char ch1, char ch2){
    if (ch1 == '(' && ch2 == ')'
    || ch1 == '[' && ch2 == ']' 
    || ch1 == '{' && ch2 == '}')
      return true;
    return false;
  }

  public boolean isValid(String s) {
      
      if (s.length() == 0)
        return true;
      Stack<Character> stack = new Stack<Character>();
      
      stack.push(s.charAt(0));
      for (int i = 1; i < s.length(); i ++){
        char ch = s.charAt(i);
        if (!stack.empty() && match(stack.peek(),ch)){
            stack.pop();
        }
        else
          stack.push(ch);
      }
      return (stack.empty());
    }
}
