package array;

import java.util.Arrays;

public class PlusOneLast {
  static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] == 9) {
        digits[i] = 0;
      } else {
        digits[i]++;
        return digits;
      }
    }
    int[] newArray = new int[digits.length + 1];
    newArray[0] = 1;

    return newArray;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    // int[] arr = { 9, 9, 9 };

    int[] result = plusOne(arr);
    System.out.println(Arrays.toString(result));
  }
}
