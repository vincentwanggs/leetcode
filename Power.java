public class Power{
  // divide and conquer
  public double pow(double x, int n) {
    if (n == 0)
      return 1;
    int val = power(x,n/2);
    if (n%2 == 0)
      return val*val;
    else
      return val * val * x;
  }
}
