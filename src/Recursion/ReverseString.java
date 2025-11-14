package recursion;

public class ReverseString {
  static String reverseStr(String str) {
    if (str.length() == 0) {
      return "";
    }

    String lastChar = reverseStr(str.substring(0, str.length() - 1));
    String reversedString = str.charAt(str.length() - 1) + lastChar;

    return reversedString;
  }

  public static void main(String[] args) {
    String str = "Pranav";

    String reversedStr = reverseStr(str);
    System.out.println(reversedStr);
  }
}
