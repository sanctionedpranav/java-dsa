package recursion;

public class BinaryToDecimal {
  static int binaryToDescimal(int num, int pow, int sum) {
    if (num == 0) {
      return sum;
    }

    int lastDigit = num % 10;
    sum = sum + (lastDigit * (int) Math.pow(2, pow));

    return binaryToDescimal(num / 10, pow + 1, sum);
  }

  public static void main(String[] args) {
    int num = 1010;

    System.out.println(binaryToDescimal(num, 0, 0));
  }
}
