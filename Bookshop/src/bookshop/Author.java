/*
 * create a bookshop project and save the book name, major, number of pages,
publish date, and author details
(name, email, date of birth) 
note that the author can write more than one book .
 */
package bookshop;

/**
 *
 * @author Suzy
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Author {
    String name;
    String email;
    Date dob;
    List<Bookshop> books;

    // Default constructor
    public Author() {
        this.name = null;
        this.email = null;
        this.dob = null;
        this.books = new ArrayList<>();
    }

    // Parameterized constructor with only name
    public Author(String name) {
        this.name = name;
        this.email = null;
        this.dob = null;
        this.books = new ArrayList<>();
    }

    // Full parameter constructor
    public Author(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.books = new ArrayList<>();
    }

    // Getter for books
    public List<Bookshop> getBooks() {
        return books;
    }

    // Method to add a book
    public void addBook(Bookshop book) {
        books.add(book);
    }
}
