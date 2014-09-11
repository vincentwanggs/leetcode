import java.io.*;
import java.utils.*;

public class ReverseInteger{

    public int reverse(int x) {
      int absValue = Math.abs(x);
      int sign = (x>0)?1:-1;
      
      int sum = 0;
      while (absValue > 0){
        int digit = absValue%10;
        sum = sum*10 + digit;
        absValue/=10;
      }
      
      return sum*sign;
    }
}
