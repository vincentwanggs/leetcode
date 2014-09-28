public class EvaluatePolish{
/*
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/
      public int evalRPN(String[] tokens) {
        
        Stack<String> stack = new Stack<String>();
        
        for (int i = 0; i < tokens.length; i ++){
          String str = tokens[i];
          if (str.equals("*") || str.equals("/") || str.equals("+") || str.equals("-")){
            char ch  = str.charAt(0);
            switch (ch){
              case '+':
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(op1+op2));
                break;
              case '-':
                 op1 = Integer.parseInt(stack.pop());
                op2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(op2-op1));
                break;
              case '*':
                op1 = Integer.parseInt(stack.pop());
                op2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(op2*op1));
                break;
              case '/':
               op1 = Integer.parseInt(stack.pop());
               op2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(op2/op1));
                break;
              default: break;
            }
          }
          else{
            stack.push(str);
          }
        }
        return (Integer.parseInt(stack.pop()));
      }
}
