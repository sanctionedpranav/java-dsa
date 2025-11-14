package array;

public class CRUDArray {
  static void insert(int index, int value) {
    int arr[] = new int[10];
    int size = 0;

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

    System.out.println("Element added in array.");
  }

  public static void main(String[] args) {
    insert(0, 100);
  }
}
