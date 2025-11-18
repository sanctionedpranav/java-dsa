package array;

public class SecondLargestElemArray {
  static void secondLargestElemArray(int arr[]) {
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] > firstLargest) {
        secondLargest = firstLargest;
        firstLargest = arr[i]; 
      }

      if (arr[i] > secondLargest && arr[i] != firstLargest) {
        secondLargest = arr[i];
      }

    }
    System.out.println(secondLargest);

  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    secondLargestElemArray(arr);

    for (int i : arr) {
      System.out.print(i + ", ");
    }
  }
}
