package array;

public class IsArraySorted {
  static boolean isSorted(int[] arr, int index) {
    if (index == arr.length -1) {
      return true;
    }

    if (arr[index] > arr[index + 1]) {
      return false;
    }

    return isSorted(arr, index + 1);
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 300, 40, 50 };

    Boolean result = isSorted(arr, 0);

    System.out.println(result ? "Sorted" : "Not sorted");
  }
}
