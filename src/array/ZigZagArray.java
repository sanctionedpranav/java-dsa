package array;

public class ZigZagArray {
  static void zigZagArray(int arr[]) {
    boolean flag = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (flag) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];

          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      } else {
        if (arr[i] < arr[i + 1]) {
          int temp = arr[i];

          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
      flag = !flag;
    }

  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    zigZagArray(arr);

    for (int i : arr) {
      System.out.print(i + ", ");
    }
  }
}
