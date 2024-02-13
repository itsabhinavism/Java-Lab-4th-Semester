//WAP to print the week day for the given day no. of the current month using switch case statement.

import java.util.*;

public class q3 {
;
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter week day: ");
    num = sc.nextInt();
    int n = num % 7;
    switch (n) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Wrong Input");
        break;
    }
  }
}
