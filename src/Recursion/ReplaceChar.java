package recursion;

public class ReplaceChar {
  static String replaceChar(String str, char search, char replace) {
    if (str.isEmpty()) {
      return "";
    }

    String replacedStr = replaceChar(str.substring(1), search, replace);

    char firstChar = str.charAt(0);

    if (firstChar == search) {
      replacedStr = replace + replacedStr;
    } else {
      replacedStr = firstChar + replacedStr;
    }

    System.out.println(firstChar);

    return replacedStr;
  }

  public static void main(String[] args) {
    String str = "Hello";

    String result = replaceChar(str, 'l', 'x');
    System.out.println(result);
  }
}
