package array;

import java.util.Arrays;

public class DNFProblem {
  static void swap(int[] nums, int i, int j) {
    int temp = nums[i];

    nums[i] = nums[j];
    nums[j] = temp;
  }

  static void sortColors(int[] nums) {
    int start = 0;
    int mid = 0;
    int end = nums.length - 1;

    while (mid < end) {
      if (nums[mid] == 0) {
        swap(nums, mid, start);
        mid++;
        start++;
      } else if (nums[mid] == 1) {
        mid++;
      } else {
        swap(nums, mid, end);
        end--;
      }
    }

  }

  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 1, 1, 0 };

    sortColors(nums);

    System.out.println(Arrays.toString(nums));

  }
}
