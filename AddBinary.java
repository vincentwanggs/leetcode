public class AddBinary{
  public String addBinary(String a, String b) {
      
      int i = a.length()-1;
      int j = b.length()-1;
      int carrier = 0;
      StringBuffer res = new StringBuffer();
      while (i >= 0 || j >= 0 ){
        int d1 = (i>=0)?(a.charAt(i)-'0'):0;
        int d2 = (j>=0)?(b.charAt(j)-'0'):0;
        int d = (d1+d2+carrier)%2;
        carrier = (d1+d2+carrier)/2;
        res.append(d);
        i --;
        j --;
      }
        
      if (carrier > 0)
        res.append(carrier);
      res.reverse();
      return res.toString();
  }
}
