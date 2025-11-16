package recursion;

public class CombinationAlphabets {
  static void combinationAlphabets(int first, String result) {

    if (result.length() == 2) {
      System.out.println(result);
      return;
    }

    if (first > 90) {
      return;
    }

    combinationAlphabets(65, result + (char) first);
    combinationAlphabets(first + 1, result);

  }

  public static void main(String[] args) {
    combinationAlphabets(65, "");

    // for (int first = 65; first <= 122; first++) {
    // if (first > 90 && first < 97) {
    // continue;
    // }
    // for (int second = 65; second <= 122; second++) {
    // if (second > 90 && second < 97) {
    // continue;
    // }

    // System.out.println((char) first + " " + (char) second);
    // }

    // }
  }
}
