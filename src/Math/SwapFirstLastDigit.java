package math;

public class SwapFirstLastDigit {
  public static void main(String[] args) {
    int num = 9246;
    int copy = num;
    int count = 0;
    int result = 0;

    while (copy != 0) {
      copy /= 10;
      count++;
    }

    int firstDigit = num / (int) Math.pow(10, count - 1);
    int lastDigit = (num % 10) * (int) Math.pow(10, count - 1);
    int middleDigit = (num / 10) % (int) Math.pow(10, count - 2);

    result = lastDigit + middleDigit * 10 + firstDigit;

    System.out.println(result);

  }
}
