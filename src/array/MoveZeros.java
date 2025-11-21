package array;

import java.util.Arrays;

public class MoveZeros {
  static void moveZeros(int[] nums) {
    int writer = 0;
    for (int reader = 0; reader < nums.length; reader++) {
      if (nums[reader] != 0) {
        nums[writer] = nums[reader];
        writer++;
      }
    }

    while (writer < nums.length) {
      nums[writer] = 0;
      writer++;
    }

  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 3, 12 };
    moveZeros(arr);

    System.out.println(Arrays.toString(arr));
  }
}
