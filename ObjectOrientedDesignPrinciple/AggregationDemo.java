package oops.principles;

import java.util.*;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Core", "Guido");

        Library l1 = new Library("City Library");
        Library l2 = new Library("Town Library");

        l1.addBook(b1);
        l2.addBook(b1);
        l2.addBook(b2);

        l1.showBooks();
        l2.showBooks();
    }
}

