class AddDigits {
  public static void main(String[] args) {
    int num = 38;
    int sum = 0;

    while (num > 9) {
      while (num != 0) {
        int lastDigit = num % 10;
        sum += lastDigit;
        num = num / 10;
      }
      num = sum;
      sum = 0;
    }

    System.out.println(num);
  }
}