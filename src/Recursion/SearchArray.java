package recursion;

public class SearchArray {
  static int searchArray(int[] arr, int index, int searchNum) {
    if (arr.length == index) {
      return 0;
    }

    int count = 0;

    if (arr[index] == searchNum) {
      count++;
    }

    return count + searchArray(arr, index + 1, searchNum);
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 99, 20, 76, 20, 50, 20 };
    int searchNum = 20;

    System.out.println(searchArray(arr, 0, searchNum));
  }
}
