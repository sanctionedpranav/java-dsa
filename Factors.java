public class Factors {
  public static void main(String[] args) {
    int num = 36;

    for (int i = 1; i <= (int)Math.sqrt(num); i++) {
      if (num % i == 0) {
        System.out.println(i);
      }
    }
  }
}
