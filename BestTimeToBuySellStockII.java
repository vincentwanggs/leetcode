import java.io.*;
import java.utils.*;

/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one 
share of the stock multiple times).
However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class BestTimeToBuySellStockII{
  public int maxProfit(int[] prices) {
        int pre = prices[0];
        int sum = 0;
        for (int i = 1; i < prices.length; i ++){
          if (prices[i] > pre){
            sum += prices[i] - pre;
          }
          pre = prices[i];
        }
        return sum;
    }
}
