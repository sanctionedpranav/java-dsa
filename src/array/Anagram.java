package array;

import java.util.Arrays;

public class Anagram {
   static boolean isAnagram(String s, String t) {
    char[] strOne = s.toCharArray();
    char[] strTwo = t.toCharArray();

    Arrays.sort(strOne);
    Arrays.sort(strTwo);

    String ss = new String(strOne);
    String tt = new String(strTwo);

    if(ss.length() != tt.length()){
      return false;
    }

    for(int i = 0; i< ss.length();i++){
      if(ss.charAt(i) != tt.charAt(i)){
        return false;
      }
    }

    return true;



   }
  public static void main(String[] args) {
    String str1 = "anagram";
    String str2 = "nagaram";

    Boolean result = isAnagram(str1, str2);

    System.out.println(result);
  }
}
