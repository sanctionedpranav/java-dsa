package MultiBranchRecursion;

public class SubSequenceStr {
  static void subSeq(String str, String result) {
    if (str.isEmpty()) {
      System.out.println(result);
      return;
    }

    subSeq(str.substring(1), result); //Not Pick
    subSeq(str.substring(1), result + str.charAt(0)); // Pick

  }

  public static void main(String[] args) {
    String str = "Pranav"; // 2 ^ number of chars
    String result = "";
    subSeq(str, result);
  }
}
