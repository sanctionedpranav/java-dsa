package array;

import java.util.Arrays;

public class CRUDArray {
  static int arr[] = new int[10];
  static int size = 0;

  static void insert(int index, int value) {

    if (index > size) {
      System.out.println("Can not insert");
      return;
    }

    if (size == arr.length) {
      System.out.println("Array full... can not insert");
      return;
    }

    for (int i = size - 1; i >= index; i--) {
      arr[i + 1] = arr[i];
    }
    arr[index] = value;
    size++;

    System.out.println("Element added..." + Arrays.toString(arr));
  }

  static void delete(int index) {
    if (index > size) {
      System.out.println("Index is greater than the size of array.");
      return;
    }

    if (arr.length == 0) {
      System.out.println("No element in the array. Empty array...");
      return;
    }

    for (int i = index; i < size - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[size - 1] = 0;
    size--;

    System.out.println("Element deleted..." + Arrays.toString(arr));
  }

  // static void print() {
  //   for (int i : arr) {
  //     System.out.println(i + ", ");
  //   }
  // }

  public static void main(String[] args) {
    insert(0, 100);
    insert(0, 200);
    insert(0, 300);
    insert(1, 1000);
    delete(0);
  }
}
