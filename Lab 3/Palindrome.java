import java.util.Scanner;

class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int reversedNum = 0;
    int originalNum = num;
    while (num != 0) {
      int remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is a palindrome number.");
    } else {
      System.out.println(originalNum + " is not a palindrome number.");
    }
  }
}
