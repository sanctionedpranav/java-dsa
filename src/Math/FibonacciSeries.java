package math;

public class FibonacciSeries {
  static int fibonacci(int num) {
    if (num <= 1) {
      return num;
    }

    int firstNum = fibonacci(num - 1);
    int secondNum = fibonacci(num - 2);

    return firstNum + secondNum;
  }

  public static void main(String[] args) {
    int num = 5;

    int result = fibonacci(num);

    System.out.println(result);

    // int num = 10;
    // int firstNum = 0;
    // int secondNum = 1;

    // System.out.print(firstNum+ "" + secondNum);

    // for (int i = 2; i < num; i++) {
    // int thirdNum = firstNum + secondNum;
    // System.out.print(thirdNum);

    // firstNum = secondNum;
    // secondNum = thirdNum;

    // System.out.println(thirdNum);
    // }

  }
}
