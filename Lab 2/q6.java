import java.util.Scanner;

class q6 {

  private double length;
  private double breadth;

  public q6() {
    length = 0;
    breadth = 0;
  }

  public q6(double len, double brd) {
    length = len;
    breadth = brd;
  }

  public double calculateArea() {
    return length * breadth;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    q6 rectangle1 = new q6();
    System.out.println(
      "Area of Rectangle with default values: " + rectangle1.calculateArea()
    );

    System.out.print("Enter the length of the rectangle: ");
    double userLength = scanner.nextDouble();

    System.out.print("Enter the breadth of the rectangle: ");
    double userBreadth = scanner.nextDouble();

    q6 rectangle2 = new q6(userLength, userBreadth);
    System.out.println(
      "Area of Rectangle with user input values: " + rectangle2.calculateArea()
    );

    scanner.close();
  }
}
