public class BestTimeToBuySellStockIII{
  public int maxProfit(int[] prices) {
    
    // given any day, we divide the price array into two parts
    // we need to find the maximum profit before it and the maximum after it, the maximum profit is the sum of
    // the left and right maximum profit
    // we use dp to store all results to avoid duplicated computation
    // left[i] has the maximum profit ending at day i
    // right[i] has the maximum profit from day i to the end
    if (prices == null || prices.length <= 1)
      return 0;
    int max = 0;
    int[] left = new int[prices.length];
    int[] right = new int [prices.length];
    getMaxPerDay (prices, left, right);
    for (int i = 0; i < prices.length; i ++)
      max = Math.max(max, left[i]+right[i]);
    return max;
  }
  
  public void getMaxPerDay(int[] prices, int[] left, int[] right){
      left[0] = 0;
      int min = prices[0];
      for (int i = 1; i < prices.length; i ++){
        int cur = prices[i];
        if (cur - min > left[i-1])
          left[i] = cur - min;
        else
          left[i] = left[i-1];
        if (prices[i] < min)
          min = prices[i];
      }
      
      right[prices.length - 1] = 0;
      int max = prices[prices.length - 1];
      for (int i = prices.length - 2; i >= 0; i --){
        if (max - prices[i] > right[i+1])
          right[i] = max - prices[i];
        else
          right[i] = right[i+1];
        if (prices[i] > max)
          max = prices[i];
      }
  }
}
