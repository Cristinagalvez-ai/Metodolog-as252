package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTest {
    Square s = new Square(5.0);

    @Test
    void getSide() { assertEquals(5.0, s.getSide()); }

    @Test
    void setSide() {
        s.setSide(10.0);
        assertEquals(10.0, s.getWidth());
        assertEquals(10.0, s.getLength());
    }

    @Test
    void setWidth() {
        s.setWidth(7.0);
        assertEquals(7.0, s.getLength()); // En Square, ambos deben ser iguales
    }

    @Test
    void testToString() {
        assertTrue(s.toString().contains("Square"));
    }
}
