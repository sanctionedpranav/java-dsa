package array;

public class SingleNumber {
  static void singleNumber(int arr[]) {
    for (int i = 0; i <= arr.length - 1; i++) {
      int currentElem = arr[i];

      for (int j = 0; j <= arr.length - 1; j++) {
        int compareElem = arr[j];

        if(currentElem == compareElem && i !=j){
          return;
        } else {
          System.out.println(currentElem);
        }
      }

    }
  }

  public static void main(String[] args) {
    int[] arr = { 4, 1, 2, 1, 2 };

    singleNumber(arr);
  }
}
