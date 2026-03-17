package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {
    Shape s = new Rectangle(1.0, 1.0, "yellow", true);

    @Test
    void getColor() { assertEquals("yellow", s.getColor()); }

    @Test
    void setColor() {
        s.setColor("purple");
        assertEquals("purple", s.getColor());
    }

    @Test
    void isFilled() { assertTrue(s.isFilled()); }

    @Test
    void setFilled() {
        s.setFilled(false);
        assertFalse(s.isFilled());
    }
}