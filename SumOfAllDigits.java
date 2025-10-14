
public class SumOfAllDigits {

    public static void main(String args[]) {
        int num = 12345;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            num = num / 10;
            sum = lastDigit;
          }
          System.out.println(sum);
    }

}
