package array;

public class BuySellStock {
  static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int lowestPrice = prices[0];

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > lowestPrice) {
        int profit = prices[i] - lowestPrice;
        maxProfit = Math.max(profit, maxProfit);
      }
      lowestPrice = Math.min(lowestPrice, prices[i]);
    }

    return maxProfit;

  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }
}
