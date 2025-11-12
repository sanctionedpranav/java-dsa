package Recursion;

public class ReverseArray {
  static int[] reverseArr(int arr[], int index) {
    if (arr.length == index) {
      int reversedArr[] = new int[arr.length];
      return reversedArr;
    }

    int reversedArr[] = reverseArr(arr, index + 1);


    return reversedArr;
  }

  public static void main(String[] args) {

    int arr[] = { 10, 20, 30, 40, 50 };

    int result[] = reverseArr(arr, 0);

    for (int i : result) {
      System.out.println(i);
    }
  }
}
