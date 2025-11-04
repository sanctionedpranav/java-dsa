package Recursion;

public class ReplaceChar {
  static String replaceChar(String str) {
    if (str.length() == 0) {
      return "";
    }

    String replacedString = replaceChar(str.substring(0, str.length() - 1));

    char lastChar = str.charAt(str.length() - 1);

    if (lastChar == 'l') {
      replacedString = replacedString + "x";
    } else {
      replacedString = replacedString + lastChar;
    }

    return replacedString;
  }

  public static void main(String[] args) {
    String str = "Hello";

    String result = replaceChar(str);
    System.out.println(result);
  }
}
