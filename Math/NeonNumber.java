package Math;
public class NeonNumber {
  public static void main(String[] args) {
    int num = 81;
    int sumNumber = 0;
    int sqNumber = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      sumNumber += lastDigit;
      sqNumber = sumNumber * sumNumber;
      num /= 10;
    }

    if(sumNumber % sqNumber == 0){
      System.out.println("Neon Number");
    } else{
      System.out.println("Not a Neon Number");
    }

  }
}
