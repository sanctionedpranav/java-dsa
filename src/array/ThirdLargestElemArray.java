package array;

public class ThirdLargestElemArray {
  static void thirdLargestElemArray(int arr[]) {
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int thirdLargest = Integer.MIN_VALUE;

    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] > firstLargest) {
        thirdLargest = secondLargest;
        secondLargest = firstLargest;
        firstLargest = arr[i];
      }

      if (arr[i] > secondLargest && arr[i] != firstLargest) {
        thirdLargest = secondLargest;
        secondLargest = arr[i];
      }

      if (arr[i] > thirdLargest && arr[i] != firstLargest && arr[i] != secondLargest) {
        thirdLargest = arr[i];
      }
    }

    System.out.println(thirdLargest);
  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    thirdLargestElemArray(arr);

    for (int i : arr) {
      System.out.print(i + ", ");
    }
  }
}
