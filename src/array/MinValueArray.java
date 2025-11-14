package array;

public class MinValueArray {
  static void minNumber(int arr[]) {
    int min = Integer.MAX_VALUE;

    for (int i : arr) {
      if (i < min) {
        min = i;
      }
    }
    System.out.println("Min is: " + min);
  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    minNumber(arr);
  }
}
