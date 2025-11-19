package math;

import java.util.HashMap;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Boolean> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return true;
      } else {
        map.put(nums[i], true);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3 };
    Boolean result = containsDuplicate(nums);
    System.out.println(result);
  }
}
