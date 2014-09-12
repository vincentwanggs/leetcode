public class Integer2Roman{

  public String digit2String(int digit, char one, char five, char ten){
  
    StringBuffer res = new StringBuffer();
    if (digit < 4){
      while (digit > 0){
        res.append(one);
        digit --;
      }
    }
    else if (digit == 4){
      res.append(one);
      res.append(five);
    }
    else if (digit < 9){
      res.append(five);
      int i = digit - 5;
      while (i > 0){
        res.append(one);
        i --;
      }
    }
    else if (digit == 9){
      res.append(one);
      res.append(ten);
    }
    return res.toString();
  }
  public String intToRoman(int num) {
        // I=1 V=5 X=10 L=50 C=100 D=500 M=1000
        //IV=4 IX=9 XL=40 XC=90 CD=400 CM=900
        char[] tokens = {'I','V','X','X','L','C','C','D','M'};
        
        int th = num/1000;
        StringBuffer res = new StringBuffer();
        for (int i = 0;i < thou; i ++)
            res.append('M');
        num = num - th*1000;
        // now process digit by digit
        String digits = String.valueOf(num);
        int index = (digits.length() - 1)*3;
        for (int i = 0; i < digits.length(); i ++){
           int digit = digits.charAt(i)-'0';
           String s = digit2String(digit, token[index],token[index+1],token[index+2]);
           res.append(s);
        }
        return s.toString();
        
  }
}
