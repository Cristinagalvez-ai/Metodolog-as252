package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s = new Shape("red", true);

        assertEquals("red", s.getColor());
    }

    @Test
    void setColor() {
        Shape s = new Shape("red", true);

        s.setColor("blue");

        assertEquals("blue", s.getColor());
    }

    @Test
    void isFilled() {
        Shape s = new Shape("red", true);

        assertTrue(s.isFilled());
    }

    @Test
    void setFilled() {
        Shape s = new Shape("red", true);

        s.setFilled(false);

        assertFalse(s.isFilled());
    }

    @Test
    void testToString() {
        Shape s = new Shape("red", true);

        String expected = "Shape[color=red,filled=true]";

        assertEquals(expected, s.toString());
    }
}