package constructor;

public class BookSystem {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public BookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }
}
