package Recursion;

public class CountEvenOdd {

  static void countEvenOdd(int n, int evenCount, int oddCount) {
    if (n == 0) {
      System.out.println("Even Count " + evenCount);
      System.out.println("Odd Count " + oddCount);
      return;
    }

    if (n % 2 == 0) {
      evenCount++;
    } else {
      oddCount++;
    }

    countEvenOdd(n - 1, evenCount, oddCount);
  }

  public static void main(String[] args) {
    int n = 5;
    int evenCount = 0;
    int oddCount = 0;
    countEvenOdd(n, evenCount, oddCount);
  }
}
