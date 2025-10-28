public class Square {
  public static void main(String[] args) {
    int num = 5;

    for (int row = 1; row <= num; row++) {
      for (int col = 1; col <= num; col++) {
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
}
