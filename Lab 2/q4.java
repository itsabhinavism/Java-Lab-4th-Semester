import java.util.Scanner;

class Calculator {

  public int subtract(int a, int b) {
    return a - b;
  }

  public double subtract(double a, double b) {
    return a - b;
  }

  public int subtract(int a, int b, int c) {
    return a - b - c;
  }
}

class q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values of a and b:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    Calculator calc = new Calculator();
    int result1 = calc.subtract(a, b);
    System.out.println("Result 1: " + result1);

    System.out.println("Enter the values of x and y:");
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double result2 = calc.subtract(x, y);
    System.out.println("Result 2: " + result2);

    System.out.println("Enter the values of p, q, and r:");
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int result3 = calc.subtract(p, q, r);
    System.out.println("Result 3: " + result3);
  }
}
