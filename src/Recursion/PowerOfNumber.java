package recursion;

public class PowerOfNumber {
  // Void Method
  // static void powerOfNumber(int num, int power, int result) {
  // if (power == 0) {
  // System.out.println(result);
  // return;
  // }
  // powerOfNumber(num, power - 1, num * result);
  // }

  // Return Method
  static int powerOfNumber(int num, int power) {
    if (power == 1) {
      return num;
    }

    int result = powerOfNumber(num, power - 1);

    return result * num;
  }

  public static void main(String[] args) {
    // powerOfNumber(2, 3, 1);
    int result = powerOfNumber(2, 3);
    System.out.println(result);
  }
}
