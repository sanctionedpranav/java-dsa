package array;

public class SearchElementArray {
  static void searchArray(int arr[]) {
    int num = 49;

    for (int i : arr) {
      if (i == num) {
        System.out.println("Number Found...");
        return;
      }
    }
    System.out.println("Number Not Found...");
  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    searchArray(arr);
  }
}
