import java.util.Scanner;

public class NameReverser {

  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner sc = new Scanner(System.in);

    // Prompt the user to enter their first name
    System.out.print("Enter your first name: ");
    // Read the first name and store it in a variable
    String firstName = sc.nextLine();

    // Prompt the user to enter their last name
    System.out.print("Enter your last name: ");
    // Read the last name and store it in another variable
    String lastName = sc.nextLine();

    // Close the Scanner object
    sc.close();

    // Print the last name followed by the first name in one line
    System.out.println(lastName + " " + firstName);
  }
}
