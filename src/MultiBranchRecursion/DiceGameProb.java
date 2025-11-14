package multiBranchRecursion;

public class DiceGameProb {
  static void diceGameProb(int start, int end, String result) {
    if (start == end) {
      System.out.print(result + ", ");
      return;
    }
    if (start > end) {
      return;
    }

    for (int i = 1; i <= 2; i++) {
      diceGameProb(start + i, end, result + i);
    }

  }

  public static void main(String[] args) {
    diceGameProb(0, 10, "");
  }
}
