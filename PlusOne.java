//Given a non-negative number represented as an array of digits, plus one to the number.

public class PlusOne{

    public int[] plusOne(int[] digits) {
      
      ArrayList<Integer> ret = new ArrayList<Integer>();
      
      int carrier = 0;
      for (int i= digits.length-1; i >= 0; i --){
        int d = digits[i];
        if (i == digits.length-1){
            ret.add((carrier+d+1)%10);
            carrier = (carrier + d+1)/10;
        }
        else{
             ret.add((carrier+d)%10);
            carrier = (carrier + d)/10;
        }
      }
      if (carrier > 0){
        ret.add(carrier);
      }
      
      int[] res = new int[ret.size()];
      int index = 0;
      for (int i = ret.size()-1; i >= 0; i --){
        res[index] = ret.get(i);
        index ++;
      }
      return res;
    }
  
}
