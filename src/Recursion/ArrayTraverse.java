package recursion;

public class ArrayTraverse {
  static int[] doubledPrices(int prices[], int index) {

    if (prices.length == index) {
      int doubledValuesArr[] = new int[prices.length];
      return doubledValuesArr;
    }

    int doubledValuesArr[] = doubledPrices(prices, index + 1);
    doubledValuesArr[index] = prices[index] * 2;

    return doubledValuesArr;
  }

  public static void main(String[] args) {
    int prices[] = { 10, 20, 30, 40, 50 };
    int result[] = doubledPrices(prices, 0);

    for (int i : result) {
      System.out.println(i);
    }
  }
}
