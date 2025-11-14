package recursion;

public class PrimeNumber {
  static void isPrimeNumber(int num, int divisor) {

    if (num < 2) {
      System.out.println("Not prime number");
      return;
    }
    if ((divisor * divisor) > num) {
      System.out.println("prime number");
      return;
    }
    if (num % divisor == 0){
      System.out.println("Not prime number");
      return;
    }

      isPrimeNumber(num, divisor + 1);
  }

  public static void main(String[] args) {
    int num = 2;
    int divisor = 2;

    isPrimeNumber(num, divisor);
  }
}
