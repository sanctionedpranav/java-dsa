package MultiBranchRecursion;

public class GeneratePin {
  static void generatePin(int length, String result) {
    if (length == 0) {
      System.out.println(result);
      return;
    }

    for (int i = 0; i <= 9; i++) {
      generatePin(length - 1, result + i);
    }
  }

  public static void main(String[] args) {
    int length = 2;

    generatePin(length, "");
  }
}
