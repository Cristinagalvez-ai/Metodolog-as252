package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.Author;

class AuthorTest {
    Author author = new Author("John Doe", "john@example.com");

    @Test
    void getName() {
        assertEquals("John Doe", author.getName());
    }

    @Test
    void getEmail() {
        assertEquals("john@example.com", author.getEmail());
    }

    @Test
    void setEmail() {
        author.setEmail("new@example.com");
        assertEquals("new@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        assertEquals("Author[name=John Doe,email=john@example.com]", author.toString());
    }
}
