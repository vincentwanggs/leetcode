public class BestTimeToBuySellStock{
  public int maxProfit(int[] prices) {
      int max = 0;
      if (prices == null || prices.length == 0)
            return max;
      int min_price = prices[0];
      for (int i = 1; i < prices.length; i ++){
        int profit = prices[i] - min_price;
        if (profit > max)
          max = profit;
        if (profit < 0)
          min_prices = prices[i];
      }
      return max;
  }
}
