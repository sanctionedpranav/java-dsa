package Recursion;

public class CountEvenOddDigits {
  
  static int[] countEvenOdd(int num){
    if(num  == 0){
      int arr[] = new int[2];
      return arr;
    }

    int arr[] = countEvenOdd(num -1);

    if(num % 2 == 0){
      arr[0]++;
    } else{
      arr[1]++;
    }
    return arr;

  }

  public static void main(String[] args) {
    int num = 99;

    int arr[] = countEvenOdd(num);

    System.out.println("Total Even " + arr[0]);
    System.out.println("Total Odd " + arr[1]);
  }
}
