package array;

public class MaxValueArray {
  static void maxNumber(int arr[]) {
    int max = Integer.MIN_VALUE;

    for (int i : arr) {
      if (i > max) {
        max = i;
      }
    }
    System.out.println("Max is: " + max);
  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    maxNumber(arr);
  }

}
