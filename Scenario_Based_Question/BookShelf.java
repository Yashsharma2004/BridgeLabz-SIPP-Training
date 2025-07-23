package Scenario_Based_Question;

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class BookShelf {
    Map<String, LinkedList<Book>> catalog = new HashMap<>();
    Set<String> uniqueBooks = new HashSet<>();

    void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        if (uniqueBooks.add(book.title)) {
            catalog.get(genre).add(book);
        }
    }

    void removeBook(String genre, String title) {
        LinkedList<Book> books = catalog.get(genre);
        if (books != null) {
            books.removeIf(b -> b.title.equals(title));
            uniqueBooks.remove(title);
        }
    }

    void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println(genre + ": " + catalog.get(genre));
        }
    }

    public static void main(String[] args) {
        BookShelf lib = new BookShelf();
        lib.addBook("Fiction", new Book("The Alchemist", "Coelho"));
        lib.addBook("Fiction", new Book("1984", "Orwell"));
        lib.displayCatalog();
    }
}
