package Math;
public class FibonacciSeries {
  public static void main(String[] args) {
    int num = 10;
    int firstNum = 0;
    int secondNum = 1;

    System.out.print(firstNum+ "" + secondNum);

    for (int i = 2; i < num; i++) {
      int thirdNum = firstNum + secondNum;
      System.out.print(thirdNum);

      firstNum = secondNum;
      secondNum = thirdNum;
    }

  }
}
