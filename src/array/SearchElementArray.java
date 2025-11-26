package array;

public class SearchElementArray {
  // static void searchArray(int arr[]) {
  // int num = 49;

  // for (int i = 0; i <= arr.length - 1; i++) {
  // if (arr[i] == num) {
  // System.out.println("Number Found at index... " + i);
  // return;
  // }
  // }
  // System.out.println("Number Not Found...");
  // }

  static boolean searchArray(int arr[], int index, int target) {
    if (index == arr.length - 1) {
      return false;
    }

    if (arr[index] == target) {
      return true;
    }

    return searchArray(arr, index + 1, target);
  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    Boolean result = searchArray(arr, 0, 49);

    System.out.println(result ? "Found" : "Not Found");
  }
}
