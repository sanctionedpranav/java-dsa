public class ReverseNumber {
  public static void main(String[] args) {
    int num = 123;
    int reverseNumber = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      reverseNumber = lastDigit + reverseNumber * 10;
      num = num / 10;
    }

    System.out.println(reverseNumber);
  }
}
