package recursion;

public class CharBtwAdjChar {
  static String charBtwAdjChar(String str) {
    if (str.length() == 1) {
      return str;
    }

    String updatedString = charBtwAdjChar(str.substring(1));

    char firstChar = str.charAt(0);
    char updatedFirstChar = updatedString.charAt(0);

    if (firstChar == updatedFirstChar) {
      updatedString = firstChar + "*" + updatedFirstChar;
    } else{
      updatedString = firstChar + updatedString;
    }

    return updatedString;
  }

  public static void main(String[] args) {
    String str = "aabbccdd";

    String result = charBtwAdjChar(str);
    System.out.println(result);
  }
}
