package recursion;

public class RemoveAdjChar {

  static String removeAdjChar(String str) {
    if (str.length() <= 1) {
      return "";
    }

    String updatedString = removeAdjChar(str.substring(1));

    if (str.charAt(0) == updatedString.charAt(0)) {
      return updatedString;
    } else {
      return str.charAt(0) + updatedString;
    }

  }

  public static void main(String[] args) {
    String str = "aabbccddc";

    String result = removeAdjChar(str);
    System.out.println(result);
  }
}
