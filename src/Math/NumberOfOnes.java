package math;

public class NumberOfOnes {
  public static int countDigitOne(int num) {
    int count = 0;

    for (int i = 0; i <= num; i++) {
      int temp = i;

      while (temp > 0) {
        int digit = temp % 10;

        if (digit == 1) {
          count++;
        }

        temp = temp / 10;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(countDigitOne(14));
  }
}
