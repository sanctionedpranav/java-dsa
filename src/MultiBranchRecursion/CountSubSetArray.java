package multiBranchRecursion;

public class CountSubSetArray {
  static void countSubSet(int arr[], int index, String result) {

    for (int i = index; i < arr.length; i++) {
      System.out.println(result + arr[i]);
      countSubSet(arr, i + 1, result + arr[i]);
    }

    // return countSubSet(arr, index + 1) + countSubSet(arr, index + 1);

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };

    countSubSet(arr, 0, "");
  }
}
