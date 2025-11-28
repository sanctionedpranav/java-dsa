package recursion;

public class AdjacentStar {
  static String adjacentStar(String str) {
    if (str.length() <= 1) {
      return str;
    }

    if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + adjacentStar(str.substring(1));
    } else {
      return str.charAt(0) + adjacentStar(str.substring(1));
    }
  }

  public static void main(String[] args) {
    System.out.println(adjacentStar("aabbccdd"));
  }
}
