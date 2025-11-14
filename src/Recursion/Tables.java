package recursion;

public class Tables {
  // static void printTable(int num, int end) {
  // if (end == 0) {
  // return;
  // }

  // printTable(num, end - 1);

  // System.out.println(num + " x " + end + " = " + (num * end));
  // }

  static String printTable(int num, int end) {
    if (end == 0) {
      return "";
    }

    String table = num + " x " + end + " = " + (num * end) + "\n";

    return table + printTable(num, end - 1);

  }

  public static void main(String[] args) {
    int num = 5;
    int end = 10;

    String result = printTable(num, end);
    System.out.println(result);
  }
}
