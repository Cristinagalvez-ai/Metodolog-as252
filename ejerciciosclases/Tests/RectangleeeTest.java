package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleeeTest {

    @Test
    void getWidth() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        assertEquals(4.0, r.getWidth(), 0.0001);
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        r.setWidth(8.0);

        assertEquals(8.0, r.getWidth(), 0.0001);
    }

    @Test
    void getLength() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        assertEquals(5.0, r.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        r.setLength(10.0);

        assertEquals(10.0, r.getLength(), 0.0001);
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        assertEquals(20.0, r.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        assertEquals(18.0, r.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(4.0, 5.0, "red", true);

        String expected = "Rectangle[Shape[color=red,filled=true],width=4.0,length=5.0]";

        assertEquals(expected, r.toString());
    }
}