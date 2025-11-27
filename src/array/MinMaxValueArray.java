package array;

public class MinMaxValueArray {
  static int[] getMinMax(int[] arr, int index) {
    if (index == arr.length) {
      int[] minMax = new int[2];
      minMax[0] = Integer.MAX_VALUE;
      minMax[1] = Integer.MIN_VALUE;
      return minMax;
    }

    int[] result = getMinMax(arr, index + 1);

    if (result[0] > arr[index]) {
      result[0] = arr[index];
    } else if (result[1] < arr[index]) {
      result[1] = arr[index];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 90, 100, 200, 50, 1, 88, 40 };

    int[] result = getMinMax(arr, 0);

    System.out.println("Min " + result[0] + " Max " + result[1]);
  }
}
