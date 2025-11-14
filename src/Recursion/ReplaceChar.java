package recursion;

public class ReplaceChar {
  static String replaceChar(String str) {
    if (str.isEmpty()) {
      return "";
    }

    String replacedStr = replaceChar(str.substring(1));

    char firstChar = str.charAt(0);

    if (firstChar == 'l') {
      replacedStr = "x" + replacedStr;
    } else {
      replacedStr = firstChar + replacedStr;
    }

    System.out.println(firstChar);

    return replacedStr;
  }

  public static void main(String[] args) {
    String str = "Hello";

    String result = replaceChar(str);
    System.out.println(result);
  }
}
