
//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
public class GenerateParentheses{

    public void generate (StringBuffer paras, int left, int right,  ArrayList<String> sol){
      if (left == 0 && right == 0){
        sol.add(paras.toString());
        return;
      }
      if (left > 0){  // 
        paras.append("(");
        generate (paras, left-1, right, sol);
        paras.deleteCharAt(paras.length()-1);
      }
      if (right > 0 && right > left){
        paras.append(")");
        generate (paras, left, right-1, sol);
        paras.deleteCharAt(paras.length()-1);
      }
    }
    public ArrayList<String> generateParenthesis(int n) {
      ArrayList<String> res = new   ArrayList<String> ();
      if (n == 0)
        return res;
      StringBuffer para = new StringBuffer();
      generate (para,n,n,res);
      return res;
    }
}
