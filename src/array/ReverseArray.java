package array;

public class ReverseArray {
  static void reverseArray(int arr[]) {
    int firstEle = 0;
    int lastEle = arr.length - 1;

    while (firstEle <= lastEle) {
      int temp = arr[firstEle];

      arr[firstEle] = arr[lastEle];
      arr[lastEle] = temp;

      firstEle++;
      lastEle--;
    }

  }

  public static void main(String[] args) {
    int arr[] = { 52, 12, 36, 64, 49, 32, 27 };

    reverseArray(arr);

    for (int i : arr) {
      System.out.print(i + ", ");
    }
  }
}
