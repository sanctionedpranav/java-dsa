package math;
public class HarshadNumber {
  public static void main(String[] args) {
    int num = 17;
    int originalNum = num;
    int sum = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      sum = sum + lastDigit;
      num /= 10;
    }

    if (originalNum % sum == 0) {
      System.out.println("Harshad Number");
    } else {
      System.out.println("Not a Harshad Number");

    }

    System.out.println(sum);
  }
}
