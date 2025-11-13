package MultiBranchRecursion;

public class SubSetArray {
  static void subSet(int arr[], int index, String result) {
    if (index == arr.length) {
      System.out.println(result);
      return;
    }

    subSet(arr, index + 1, result);
    subSet(arr, index + 1, result + arr[index]);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };

    subSet(arr, 0, "");
  }
}
