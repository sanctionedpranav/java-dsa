package math;

public class EvenOddPositionSum {
  public static void main(String[] args) {
    int num = 8765;
    int position = 0;
    int evenSum = 0;
    int oddSum = 0;

    while (num != 0) {
      int lastDigit = num % 10;

      position++;

      if (position % 2 == 0) {
        evenSum = evenSum + lastDigit;
      } else {
        oddSum = oddSum + lastDigit;
      }

      num /= 10;
    }

    System.out.println("Even sum " + evenSum);
    System.out.println("Odd sum " + oddSum);
  }
}
