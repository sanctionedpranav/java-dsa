package recursion;

public class SumOfDigits {
  // Using Void in function

  // static void sumOfDigits(int num, int result) {
  // int lastDigit = num % 10;
  // result += lastDigit;

  // if (num == 0) {
  // System.out.println(result);
  // return;
  // }

  // sumOfDigits(num / 10, result);
  // }

  // Using Int / return in the function.

  static int sumOfDigits(int num) {
    if (num == 0) {
      return 0;
    }

    int sum = sumOfDigits(num / 10);
    int digit = num % 10;

    return sum += digit;
  }

  public static void main(String[] args) {
    // sumOfDigits(12345, 0);
    System.out.println(sumOfDigits(12345));
  }
}
