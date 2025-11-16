package math;

import java.util.HashMap;

public class FrequencyCountDigit {
  public static void main(String[] args) {
    int num = 95403033;

    HashMap<Integer, Integer> map = new HashMap<>();

    while (num != 0) {
      int lastDigit = num % 10;

      if (map.get(lastDigit) == null) { // get(key);
        map.put(lastDigit, 1); // put(key, value);
      } else {
        int count = map.get(lastDigit);
        count++;
        map.put(lastDigit, count);
      }
      num /= 10;
    }

    System.out.println(map);
  }
}
