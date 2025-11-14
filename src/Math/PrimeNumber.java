package math;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number to check if it is Prime or Not: ");
    int num = scanner.nextInt();

    // One Way to do it without optimize

    // int factor = 0;

    // for (int i = 1; i <= num; i++) {
    // if (num % i == 0) {
    // factor++;
    // }
    // }

    // if (factor == 2) {
    // System.out.println("Prime Number");
    // } else {
    // System.out.println("Not a Prime Number");
    // }

    // Anothery way which is much faster with optimized
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        System.out.println("Not A Prime Number");
        return;
      }
    }
    System.out.println("Prime Number");
    scanner.close();
  }
}
