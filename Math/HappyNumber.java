package Math;
public class HappyNumber {
  public static void main(String[] args) {
    int num = 2;
    int sum = 0;

    while (num != 1) {
      while (num != 0) {
        int lastDigit = num % 10;
        sum = sum + lastDigit * lastDigit;
        num = num / 10;
      }
      num = sum;
      sum = 0;
    }

    if(num == 1){
      System.out.println("Happy Number");
    } else {
      System.out.println("Not a Happy Number");
    }

    System.out.println(num);

  }
}
