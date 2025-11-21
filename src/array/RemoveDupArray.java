package array;

public class RemoveDupArray {
  static int removeDuplicates(int[] nums) {
    int writer = 0;

    for (int reader = 1; reader < nums.length; reader++) {
      if (nums[reader] != nums[writer]) {
        writer++;
        nums[writer] = nums[reader];
      }
    }

    return writer + 1;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    int result = removeDuplicates(nums);
    System.out.println(result);
  }
}
