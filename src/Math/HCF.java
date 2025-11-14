package math;
public class HCF {
  public static void main(String[] args) {
    int num1 = 155667;
    int num2 = 54321;
    int HCF = 0;

    for (int i = 1; i <= Math.min(num1, num2); i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        HCF = i;
      }
    }
    System.out.println(HCF);
  }
}
