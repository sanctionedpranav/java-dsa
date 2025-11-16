package math;

public class PalindromeString {
  static boolean palindromeString(String str, int start, int end) {

    if (start > end) {
      return true;
    }

    if(str.charAt(start) != str.charAt(end)){
      return false;
    }

    return palindromeString(str, start + 1, end - 1);

  }

  public static void main(String[] args) {
    String str = "racecar";

    System.out.println(palindromeString(str, 0, str.length() - 1));
  }
}
