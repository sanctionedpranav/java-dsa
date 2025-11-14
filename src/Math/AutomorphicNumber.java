package math;
public class AutomorphicNumber {
  public static void main(String[] args) {
    int num = 6;
    int square = num * num;

    int lastDigit = square % 10;

    if (lastDigit == num) {
      System.out.println("Automorphic Number");
    } else {
      System.out.println("Not an Automorphic Number");
    }

    System.out.println(num);
    System.out.println(lastDigit);
  }
}
