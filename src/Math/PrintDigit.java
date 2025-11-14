package math;

import java.util.Scanner;

public class PrintDigit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number to print vertically:");
    int num = scanner.nextInt();
    int copy = num;
    int count = 0;

    while (num != 0) {
      num = num / 10;
      count++;
    }

    num = copy;
    int power = (int) Math.pow(10, count - 1);

    while (num != 0) {
      int startDigit = num / power;
      System.out.println(startDigit);

      num = num % power;
      power = power / 10;
    }

    scanner.close();
  }
}
