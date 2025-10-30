public class SpyNumber {
  public static void main(String[] args) {
    int num = 1124;
    int sumNumber = 0;
    int mulNumber = 1;

    while (num != 0) {
      int lastDigit = num % 10;
      sumNumber += lastDigit;
      mulNumber *= lastDigit;

      num /= 10;
    }

    if (sumNumber == mulNumber) {
      System.out.println("Spy Number");
    } else {
      System.out.println("Not a Spy Number");
    }

    System.out.println(sumNumber);
    System.out.println(mulNumber);

  }
}
