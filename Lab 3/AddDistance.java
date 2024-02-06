import java.util.Scanner;

class Distance {

  private int kilometer;
  private int meter;

  Distance(int kilometer, int meter) {
    this.kilometer = kilometer;
    this.meter = meter;
  }

  public int getKilometer() {
    return this.kilometer;
  }

  public int getMeter() {
    return this.meter;
  }

  Distance add(Distance d) {
    int km = this.kilometer + d.kilometer;
    int m = this.meter + d.meter;
    if (m >= 1000) {
      m -= 1000;
      km++;
    }
    return new Distance(km, m);
  }
}

public class AddDistance {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first distance (kilometer meter):");
    Distance d1 = new Distance(scanner.nextInt(), scanner.nextInt());

    System.out.println("Enter the second distance (kilometer meter):");
    Distance d2 = new Distance(scanner.nextInt(), scanner.nextInt());

    Distance d3 = d1.add(d2);

    System.out.println(
      "Sum of the two distances is: " +
      d3.getKilometer() +
      " kilometer " +
      d3.getMeter() +
      " meter"
    );
  }
}
