import java.util.Scanner;

class q5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Choose a shape:\n1. Circle\n2. Triangle\n3. Square");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Enter the radius of the circle:");
        displayArea(area(sc.nextDouble()));
        break;
      case 2:
        System.out.println("Enter the base of the triangle:");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        displayArea(area(base, sc.nextDouble()));
        break;
      case 3:
        System.out.println("Enter the side of the square:");
        displayArea(area(sc.nextDouble()));
        break;
      default:
        System.out.println("Invalid choice.");
    }
  }

  static double area(double radius) {
    return 3.14159 * radius * radius;
  }

  static double area(double base, double height) {
    return 0.5 * base * height;
  }

  static double area(int side) {
    return side * side;
  }

  static void displayArea(double area) {
    System.out.println("Area: " + area);
  }
}
