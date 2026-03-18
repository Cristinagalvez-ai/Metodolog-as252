package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {
    Rectangle r = new Rectangle(2.0, 4.0, "blue", false);

    @Test
    void getWidth() { assertEquals(2.0, r.getWidth()); }

    @Test
    void getLength() { assertEquals(4.0, r.getLength()); }

    @Test
    void getArea() { assertEquals(8.0, r.getArea()); }

    @Test
    void getPerimeter() { assertEquals(12.0, r.getPerimeter()); }

    @Test
    void testToString() {
        assertTrue(r.toString().contains("Rectangle"));
        assertTrue(r.toString().contains("width=2.0"));
    }
}