package recursion;

public class ReplaceWord {
  static String replaceWord(String str) {
    if (str.length() <= 1) {
      return str;
    }
    if (str.charAt(0) == 'H' && str.charAt(1) == 'i') {
      String smallProb = str.substring(2);
      String result = replaceWord(smallProb);

      return "Hello" + result;
    } else {
      String smallProb = str.substring(1);
      String result = replaceWord(smallProb);

      char firstChar = str.charAt(0);

      return firstChar + result;
    }
  }

  public static void main(String[] args) {
    String str = "Hi Amit Hi Tim";
    String result = replaceWord(str);
    System.out.println(result);
  }
}
