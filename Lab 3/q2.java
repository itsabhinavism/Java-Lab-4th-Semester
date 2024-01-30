import java.util.Scanner;

class Rectangle {

  public static double length;
  public static double breadth;

  public static void read() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    length = s.nextDouble();
    System.out.print("Enter the breadth of the rectangle: ");
    breadth = s.nextDouble();
  }

  public static double calculateArea() {
    return length * breadth;
  }

  public static double calculatePerimeter() {
    return 2 * (length + breadth);
  }

  public static void display() {
    System.out.println("Area of the rectangle is : " + calculateArea());
    System.out.println(
      "Perimeter of the rectangle is : " + calculatePerimeter()
    );
  }
}

public class AreaPerimeter {

  public static void main(String[] args) {
    Rectangle.read();
    Rectangle.display();
  }
}
