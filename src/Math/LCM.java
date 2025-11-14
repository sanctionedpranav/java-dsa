package math;
public class LCM {
  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 6;
    int LCM = 0;

    for (int i = 1; i <= (num1 * num2); i++) {
      if (i % num1 == 0 && i % num2 == 0) {
        LCM = i;
        break;
      }
    }
    System.out.println(LCM);
  }
}
