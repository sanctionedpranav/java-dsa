package math;
public class RotateNumber {
  public static void main(String[] args) {
    int num = 12345;
    int originalNum = num;
    int rotation = 2;
    int left = 0;
    int right = 0;
    int count = 0;

    while (num != 0) {
      num /= 10;
      count++;
    }

    int lastDigits = originalNum % (int) Math.pow(10, rotation);
    right += lastDigits;
    left = originalNum / (int) Math.pow(10, rotation);

    right *= (int) Math.pow(10, count - rotation);

    num = left + right;

    System.out.println(lastDigits);
    System.out.println(num);

  }
}
