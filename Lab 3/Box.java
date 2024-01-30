import java.util.Scanner;

class Box {
public static void main(String[] args) {

  double length;
  double width;
  double height;

  public Box(double l, double w, double h) {
    length = l;
    width = w;
    height = h;
  }

  public double volume() {
    return length * width * height;
  }
}


class Demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length, width, and height of the box:");
    double l = sc.nextDouble();
    double w = sc.nextDouble();
    double h = sc.nextDouble();
    Box b = new Box(l, w, h);
    System.out.println("The volume of the box is " + b.volume());
  }
}
