package Recursion;

public class Repetition {
  static void printName(int count) {
    if (count == 0) {
      return;
    }
    System.out.println("Pranav " + count);

    printName(count - 1);

    System.out.println("Sharma " + count);
  }

  public static void main(String[] args) {
    printName(5);
  }
}
