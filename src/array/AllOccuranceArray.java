package array;

public class AllOccuranceArray {
  static int[] elementOccuranceHelper(int[] arr, int index, int search, int count) {
    if (index == arr.length) {
      int[] result = new int[count];
      return result;
    }
    if (search == arr[index]) {
      count++;
    }
    int result[] = elementOccuranceHelper(arr, index + 1, search, count);

    if (search == arr[index]) {
      result[count - 1] = index;
    }

    return result;
  }

  static int[] elementOccurance(int[] arr, int index, int search) {
    return elementOccuranceHelper(arr, index, search, 0);
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 50, 40, 50, 60 };

    int[] result = elementOccurance(arr, 0, 50);

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
