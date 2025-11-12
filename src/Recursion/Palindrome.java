package Recursion;

public class Palindrome {
  static boolean isPalindrome(int num, int reversedNum, int originalNum) {

      if (num == 0) {
            return reversedNum == originalNum;
        } 

        int lastDigit = num % 10;
        reversedNum = lastDigit + (reversedNum * 10);

        return isPalindrome(num / 10, reversedNum, originalNum);

  }

  public static void main(String[] args) {
    int num = 10;
    int reverse = 0;
    int originalNum = num;

    System.out.println(isPalindrome(num, reverse, originalNum) ? "Palindrom Number" : "Not Palindrom Number");
  }
}
