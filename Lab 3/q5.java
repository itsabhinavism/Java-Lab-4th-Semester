import java.util.Scanner;

class q5 {

  
  public static void area(double radius) {
    double circleArea = Math.PI * radius * radius;
    System.out.println("Area of Circle: " + circleArea);
  }

  
  public static void area(double base, double height) {
    double triangleArea = 0.5 * base * height;
    System.out.println("Area of Triangle: " + triangleArea);
  }

  
  public static void area(double side) {
    double squareArea = side * side;
    System.out.println("Area of Square: " + squareArea);
  }
}

public class AreaDemo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Get user choice
    System.out.println("Select a shape to find the area:");
    System.out.println("1. Circle");
    System.out.println("2. Triangle");
    System.out.println("3. Square");
    System.out.print("Enter your choice (1/2/3): ");
    int choice = scanner.nextInt();


    switch (choice) {
      case 1:
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        AreaCalculator.area(radius);
        break;
      case 2:
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        AreaCalculator.area(base, height);
        break;
      case 3:
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        AreaCalculator.area(side);
        break;
      default:
        System.out.println("Invalid choice!");
    }


    scanner.close();
  }
}
