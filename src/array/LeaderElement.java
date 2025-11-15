package array;

import java.util.ArrayList;

public class LeaderElement {
  static ArrayList<Integer> leaderElement(int arr[]) {
    ArrayList<Integer> list = new ArrayList<>();
    int max = 0;

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > max || arr[i] == max) {
        max = arr[i];
        list.add(0, max);
      }
    }

    return list;
  }

  public static void main(String[] args) {
    // int arr[] = { 16, 17, 4, 3, 5, 2 };
    int arr[] = { 10, 4, 2, 4, 1 };
    // int arr[] = { 30, 10, 10, 5 };

    System.out.print(leaderElement(arr));
  }
}
