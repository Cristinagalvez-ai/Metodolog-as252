package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.*;

class BookTest {
    Author author = new Author("Jane Doe", "jane@example.com");
    Book book = new Book("978-3-16", "Java Guide", author, 29.99, 10);

    @Test
    void getIsbn() {
        assertEquals("978-3-16", book.getIsbn());
    }

    @Test
    void getName() {
        assertEquals("Java Guide", book.getName());
    }

    @Test
    void getAuthor() {
        assertEquals(author, book.getAuthor());
    }

    @Test
    void getPrice() {
        assertEquals(29.99, book.getPrice());
    }

    @Test
    void setPrice() {
        book.setPrice(19.99);
        assertEquals(19.99, book.getPrice());
    }

    @Test
    void getQty() {
        assertEquals(10, book.getQty());
    }

    @Test
    void setQty() {
        book.setQty(5);
        assertEquals(5, book.getQty());
    }

    @Test
    void getAuthorName() {
        assertEquals("Jane Doe", book.getAuthorName());
    }

    @Test
    void testToString() {
        assertTrue(book.toString().contains("Author[name=Jane Doe"));
    }
}
