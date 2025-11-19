package array;

import java.util.Arrays;

public class TwoSumArray {
  static int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left <= right) {
      int sum = numbers[left] + numbers[right];

      if (sum == target) {
        return new int[] { left + 1, right + 1 };
      }

      if (sum > target) {
        right--;
      } else {
        left++;
      }
    }
    return null;

  }

  public static void main(String[] args) {
    int[] numbers = { 2, 7, 11, 15 };
    // int[] numbers = { 2, 3, 4 };
    int target = 9;
    // int target = 6;

    int[] result = twoSum(numbers, target);
    System.out.println(Arrays.toString(result));
  }
}
