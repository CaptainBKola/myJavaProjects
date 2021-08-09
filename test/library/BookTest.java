/*package library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    void addBook() {
        Book book = new Book("My Coding Adventure", "Kola");
        Library library = new Library();

        assertEquals("Kola", book.author);

        library.getTotalBooksInLibrary();

    }


    Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
    Book b2 = new Book("Thinking in Java", "Bruce Eckel");
    Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

    // Creating the list which contains the
    // no. of books.


    public static void main(String[] args) {

        List<Book> book = new ArrayList<Book>();
        book.add(b1);
        book.add(b2);
        book.add(b3);

        Library library = new Library(book);

        List<Book> books = library.getTotalBooksInLibrary();
        for (Book bk : books) {

            System.out.println("Title : " + bk.title
                    + " and "
                    + " Author : " + bk.author);
        }
    }
}


*/