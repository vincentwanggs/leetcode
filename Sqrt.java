public class Sqrt{

  public long helper(long x, long low, long high){
    if (low > high)
      return high;
    long mid = (low+ high)/2;
    long val = mid*mid;
    if (val == x)
      return mid;
    else if (val > x)
      return helper(x,low,mid-1);
    else 
      return helper(x,mid+1,high);
  }
  public int sqrt(int x) {
      if (x <= 1)
            return x;
	    int low = 1;
	    int high = x/2;
	    return (int)helper(x,(long)low, (long)high);  
  }
}
