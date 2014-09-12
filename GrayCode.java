/*
The gray code is a binary numeral system where two successive values differ in only one bit.
Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code.
A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
*/

public class GrayCode{

  public ArrayList<String> getGrayCode(int n) {
    ArrayList<String> ret = new ArrayList<String>();
    if (n == 1){
      ret.add("0");
      ret.add("1");
      return ret;
    }
    ArrayList<String> pre = getGrayCode(n-1);
    for (int i = 0; i < pre.size(); i ++){
        ret.add ("0"+pre.get(i));
    }
    for (int i = pre.size() - 1; i >= 0; i --){
        ret.add ("1"+pre.get(i));
    }
    return ret;
  }


  public ArrayList<Integer> stringArr2int (ArrayList<String> gcodes){
     ArrayList<Integer> ret = new  ArrayList<Integer> ();
     
     for (int i = 0; i < gcodes.size(); i ++){
      
        String codes = gcodes.get(i);
        int sum = 0;
        for (int j = 0; j < codes.length(); j ++){
          sum = sum*2 + (codes.charAt(j)-'0');
        }
        ret.add(sum);
     }
     return ret;
  }
  public ArrayList<Integer> grayCode(int n) {
     ArrayList<Integer> ret = new ArrayList<Integer> ();
      if (n == 0){
        ret.add(0);
        return ret;
      }
      
      ArrayList<String> gcodes = getGrayCode(n);
      ret = stringArr2int(gcodes);
      return ret;
      
  }
}
