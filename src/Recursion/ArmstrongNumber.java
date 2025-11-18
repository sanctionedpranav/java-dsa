package recursion;

public class ArmstrongNumber {
  static int countDigit(int num) {
    if (num == 0) {
      return 0;
    }

    int count = countDigit(num / 10);

    return count + 1;
  }

  static void findArmstrongNum(int num, int copy, int sum) {
    if (num == 0) {
      if (sum == copy) {
        System.out.println("Armstrong number");
      } else {
        System.out.println("Not Armstrong number");

      }
      return;
    }

    int count = countDigit(copy);

    int lastDigit = num % 10;
    sum = sum + (int) Math.pow(lastDigit, count);

    findArmstrongNum(num / 10, copy, sum);

  }

  public static void main(String[] args) {
    findArmstrongNum(153, 153, 0);
  }
}
