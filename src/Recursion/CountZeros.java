package recursion;

public class CountZeros {
  static int countZeros(int num) {
    if (num == 0) {
      return 1;
    }

    if (num < 10 && num != 0) {
      return 0;
    }

    int lastDigit = num % 10;
    int count = 0;

    if (lastDigit == 0) {
      count++;
    }

    return count + countZeros(num / 10);

  }

  public static void main(String[] args) {
    int num = 100000;

    int result = countZeros(num);
    System.out.println(result);

  }
}
