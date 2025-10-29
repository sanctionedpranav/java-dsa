public class ArmstrongNumber {
  public static void main(String[] args) {
    int num = 153;
    int dupNumber = num;
    int count = 0;
    int armstrongNumber = 0;

    while (num != 0) {
      num = num / 10;
      count++;
    }

    num = dupNumber;

    while (num != 0) {
      int lastDigit = num % 10;
      armstrongNumber = armstrongNumber + (int) Math.pow(lastDigit, count);
      num = num / 10;
    }

    if (dupNumber == armstrongNumber) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not an Armstrong Number");
    }

    System.out.println("ArmStrong No: " + armstrongNumber);

  }
}
