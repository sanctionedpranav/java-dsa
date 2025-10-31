package recursion;

public class Factorial {
  static void factorial(int num, long fact) {

    if (num == 1) {
      System.out.println(fact);
      return;
    }
    
    fact = fact * num;

    factorial(num - 1, fact);
  }

  public static void main(String[] args) {
    int num = 5;
    long fact = 1;

    factorial(num, fact);
  }
}
