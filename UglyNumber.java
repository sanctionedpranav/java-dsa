public class UglyNumber {
  public static void main(String[] args) {
    int num = 14;
    int originalNum = num;

    if (num >= 0) {
      while (num % 2 == 0) {
        num = num / 2;
      }
      while (num % 3 == 0) {
        num = num / 3;
      }
      while (num % 5 == 0) {
        num = num / 5;
      }

      if (num == 1) {
        System.out.println(originalNum + " Ugly Number ");
      } else {
        System.out.println(originalNum + " Not an Ugly Number");
      }
    }
  }
}
