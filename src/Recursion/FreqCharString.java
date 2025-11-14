package recursion;

public class FreqCharString {
  static int freqCharString(String str) {
    if (str.isEmpty()) {
      return 0;
    }

    int count = freqCharString(str.substring(0, str.length() - 1));

    char lastChar = str.charAt(str.length() - 1);

    if (lastChar == 'a') {
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    String str = "Banana Pranav";

    int result = freqCharString(str);
    System.out.println(result);
  }
}
