public class DivideTwoIntegers{
  public int divide(int dividend, int divisor) {
  
    long n1 = Math.abs((long)dividend);
		long n2 = Math.abs((long)divisor);
    
    int res = 0;
    while (n1 >= n2){
      
      int shifts = 1;
      while ((n2<<(shifts)) <= n1)
        shifts ++;
      shifts --;
      n1 = n1 - (n2<<shifts);
      res += 1<< shifts;
    }
    return (((dividend^divisor)>>31) != 0) ? (-res) : (res);
  }
}
