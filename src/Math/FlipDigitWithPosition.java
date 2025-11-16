package math;

public class FlipDigitWithPosition {
  public static void main(String[] args) {
    int num = 42153;
    int position = 0;
    int sum = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      position++;

      int power = (int) Math.pow(10, lastDigit - 1);
      sum = sum + power * position;
      num /= 10;

    }

    System.out.println(sum);
  }
}
