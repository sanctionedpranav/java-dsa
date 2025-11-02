package Recursion;

public class Tables {
  static void printTable(int num, int end) {
    if (end == 0) {
      return;
    }

    printTable(num, end - 1);

    System.out.println(num + " x " + end + " = " + (num * end));
  }

  public static void main(String[] args) {
    int num = 2;
    int end = 10;

    printTable(num, end);
  }
}
