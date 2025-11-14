package multiBranchRecursion;

public class GeneratePinBinary {

  static void generatePinBinary(int length, String result) {
    if (length == 0) {
      System.out.println(result);
      return;
    }

    generatePinBinary(length - 1, result + 0); // Not Pick
    generatePinBinary(length - 1, result + 1); // Pick
  }

  public static void main(String[] args) {
    int length = 3;

    generatePinBinary(length, "");
  }
}
