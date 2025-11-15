package array;

public class MaxConsecutiveOnes {
  static int findMaxConsecutiveOnes(int arr[]) {
    int maxCount = 0;
    int currentCount = 0;

    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] == 1) {
        currentCount++;
      } else {
        currentCount = 0;
      }

      if (currentCount > maxCount) {
        maxCount = currentCount;
      }
    }

    return maxCount;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 0, 1, 1, 1 };

    System.out.println(findMaxConsecutiveOnes(arr));
  }
}
