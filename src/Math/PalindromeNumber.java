package math;
public class PalindromeNumber {
  public static void main(String[] args) {
    int num = 12121;
    int originalNum = num;
    int reversed = 0;

    while (num != 0) {
      int lastDigit = num % 10;

      reversed = lastDigit + reversed * 10;

      num = num / 10;
    }

    if (originalNum == reversed) {
      System.out.println("Palindrom Number");
    } else {
      System.out.println("Not a Palindrom Number");
    }

    System.out.println(reversed);
  }
}
