/*
 create a bookshop project and save the book name, major, number of pages, publish date, 
and author details (name, email, date of birth) 
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

public class Bookshop {
    String name;
    String major;
    int numberOfPages;
    Date publishDate;
    List<Bookshop> books;

    //default constructor
    public Bookshop() {
        this.name = null;
        this.major = null;
        this.numberOfPages = 0;
        this.publishDate = null;
        this.books = new ArrayList<>();
    }
    // pramertized constructor 
    public Bookshop(String name) {
        this.name = name;
        
    }
    //full pramertized constructor
    public Bookshop(String name, String major, int numberOfPages, Date publishDate) {
        this.name = name;
        this.major = major;
        this.numberOfPages = numberOfPages;
        this.publishDate = publishDate;
        this.books = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smith");

        // Create books
        Bookshop book1 = new Bookshop("Book 1", "Programming", 300, new Date());
        Bookshop book2 = new Bookshop("Book 2", "Fiction", 250, new Date());
        Bookshop book3 = new Bookshop("Book 3", "Fantasy", 400, new Date());

        // Add books to authors
        author1.getBooks().add(book1);
        author2.getBooks().add(book2);
        author2.getBooks().add(book3);

        // Display authors and their books
        System.out.println("Author: " + author1.name);
        for (Bookshop book : author1.getBooks()) {
            System.out.println("Book: " + book.name);
        }

        System.out.println("\nAuthor: " + author2.name);
        for (Bookshop book : author2.getBooks()) {
            System.out.println("Book: " + book.name);
        }
    }
}
