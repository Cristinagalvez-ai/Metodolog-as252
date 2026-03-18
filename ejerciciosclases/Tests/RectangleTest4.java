package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleeTest {
    Rectanglee re = new Rectanglee(3.0, 2.0);

    @Test
    void getArea() { assertEquals(6.0, re.getArea()); }

    @Test
    void getPerimeter() { assertEquals(10.0, re.getPerimeter()); }

    @Test
    void testToString() {
        assertEquals("Rectangle[width=3.0,length=2.0]", re.toString());
    }
}
