public class MultiplyStrings{
  public String add(String num1, String num2){
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuffer res = new StringBuffer();
        int carrier = 0;
        while (i >= 0 || j >= 0){
            int op1 = (i >=0 )?(num1.charAt(i)-'0'):0;
            int op2 = (j >= 0)?(num2.charAt(j)-'0'):0;
            int digit = (op1+op2+carrier)%10;
            carrier = (op1+op2+carrier)/10;
            i--;
            j--;
            res.append(digit);
        }
        if (carrier > 0)
            res.append(carrier);
        return res.reverse().toString();
    }
  public String multiply(String num1, String num2) {
  
    String longer = (num1.length() > num2.length())?num1:num2;
        String shorter = (num1.length() > num2.length())?num2:num1;
    String temp = "0";
     if (num1.equals("0") || num2.equals("0"))
            return "0";
    for (int i = shorter.length()-1; i >= 0; i --){
      int op1 = shorter.charAt(i)- '0';
      int carrier = 0;
      StringBuffer product = new StringBuffer();
      for (int j = longer.length() - 1; j >= 0; j --){
        int op2 = longer.charAt(j)- '0';
        int digit = (op1*op2+carrier)%10;
        carrier = (op1*op2+carrier)/10;
        product.append(digit);
      }
      if (carrier > 0){
          product.append(carrier);
      }
      product = product.reverse();
      for (int k = shorter.length()-1; k > i; k --)
        product.append("0");
      temp = add(product.toString(),temp);
    }
    return temp;
  }
}
