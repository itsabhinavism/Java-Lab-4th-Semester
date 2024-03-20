import java.util.Scanner;

class Box {

  private double length;
  private double width;
  private double height;

  public Box(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public double calculateVolume() {
    return length * width * height;
  }
}

public class q1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length of the box: ");
    double length = input.nextDouble();

    System.out.print("Enter the width of the box: ");
    double width = input.nextDouble();

    System.out.print("Enter the height of the box: ");
    double height = input.nextDouble();

    Box myBox = new Box(length, width, height);
    double volume = myBox.calculateVolume();

    System.out.printf("The volume of the box is %.2f cubic units.%n", volume);
  }
}
