package recursion;

public class DecimalToBinary {
  static void convertDecimalToBinary(int num, String result) {
    if (num == 0) {
      System.out.println(result);
      return;
    }

    convertDecimalToBinary(num / 2, num % 2 + result);
  }

  public static void main(String[] args) {
    int num = 18;
    String result = "";

    convertDecimalToBinary(num, result);
  }
}
