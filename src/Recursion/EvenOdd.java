package recursion;

public class EvenOdd {
  static void getEven(int num) {
    if (num == 0) {
      return;
    }

    getEven(num - 1);

    if (num % 2 == 0) {
      System.out.println("Even Nums:" + num);
    }

    if (num % 2 != 0) {
      System.out.println("Odd Nums:" + num);
    }
  }

  public static void main(String[] args) {
    int num = 10;

    getEven(num);
  }
}
