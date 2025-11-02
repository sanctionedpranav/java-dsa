package Math;
public class PowerOfNumber {
  public static void main(String[] args) {
    int num = 5;
    int copy = num;
    int power = 6;

    for (int i = 1; i <= power - 1; i++) {
      num = num * copy;
    }
    System.out.println(num);

  }
}
