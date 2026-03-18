package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleeTest {
    Circlee c = new Circlee(2.0);

    @Test
    void getArea() {
        assertEquals(Math.PI * 4, c.getArea(), 0.001);
    }

    @Test
    void getPerimeter() {
        assertEquals(2 * Math.PI * 2, c.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=2.0]", c.toString());
    }
 }
