public class PetersonNumber {
  public static void main(String[] args) {
    int num = 145;
    int dupNumber = num;
    int petersonNumber = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      int factors = 1;

      for (int i = 1; i <= lastDigit; i++) {
        factors = i * factors;
      }

      petersonNumber = factors + petersonNumber;
      num = num / 10;

    }

    if (dupNumber == petersonNumber) {
      System.out.println(dupNumber + ": is a Peterson Number");
    } else {
      System.out.println(dupNumber + ": is a Not Peterson Number");

    }

    System.out.println(petersonNumber);
    System.out.println(num);
  }
}
