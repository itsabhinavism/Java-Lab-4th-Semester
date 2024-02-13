import java.util.Scanner;

public class Book {

  private String title;
  private String author;
  private String isbn;
  private double price;

  // Constructor with all attributes
  public Book(String title, String author, String isbn, double price) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
  }

  // Constructor with title and author
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isbn = "";
    this.price = 0.0;
  }

  // Getters and setters for each attribute
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter book title:");
    String title = scanner.nextLine();

    System.out.println("Enter book author:");
    String author = scanner.nextLine();

    System.out.println("Enter book ISBN:");
    String isbn = scanner.nextLine();

    System.out.println("Enter book price:");
    double price = scanner.nextDouble();

    // Create a book with user input
    Book book = new Book(title, author, isbn, price);
    System.out.println("Book Title: " + book.getTitle());
  }
}
