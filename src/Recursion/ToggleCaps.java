package recursion;

public class ToggleCaps {
  static String toggleCaps(String str) {
    if (str.length() == 0) {
      return "";
    }

    String smallProblemString = toggleCaps(str.substring(1));

    char firstChar = str.charAt(0);

    if (firstChar >= 65 && firstChar <= 90) {
      firstChar = (char) (firstChar + 32);
    } else {
      firstChar = (char) (firstChar - 32);
    }

    return firstChar + smallProblemString;
  }

  public static void main(String[] args) {
    String str = "aBcDeFgH";

    System.out.println(toggleCaps(str));
  }
}
