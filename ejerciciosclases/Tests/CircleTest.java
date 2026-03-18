package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {
    Circle c = new Circle(5.0, "red", true);

    @Test
    void getRadius() {
        assertEquals(5.0, c.getRadius());
    }

    @Test
    void setRadius() {
        c.setRadius(10.0);
        assertEquals(10.0, c.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI * 25, c.getArea(), 0.001);
    }

    @Test
    void testToString() {
        assertTrue(c.toString().contains("Circle"));
        assertTrue(c.toString().contains("radius = 5.0"));
    }
}