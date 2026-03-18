package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        assertEquals(5.0, r.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        r.setLength(10.0f);

        assertEquals(10.0, r.getLength(), 0.0001);
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        assertEquals(4.0, r.getWidth(), 0.0001);
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        r.setWidth(8.0f);

        assertEquals(8.0, r.getWidth(), 0.0001);
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        // 4 * 5 = 20
        assertEquals(20.0, r.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        // 2 * (4 + 5) = 18
        assertEquals(18.0, r.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(4.0f, 5.0f);

        String expected = "Rectangle[length=5.0,width=4.0]";

        assertEquals(expected, r.toString());
    }
}
