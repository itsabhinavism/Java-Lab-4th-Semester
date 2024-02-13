public class q2 {

  private String title;
  private String author;
  private String isbn;
  private double price;


  public q2(String title, String author, String isbn, double price) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
  }


  public q2(String title, String author) {
    this.title = title;
    this.author = author;
    this.isbn = "";
    this.price = 0.0;
  }


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
}
