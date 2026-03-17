package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(5.0);

        assertEquals(5.0, c.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle(5.0);

        c.setRadius(10.0);

        assertEquals(10.0, c.getRadius());
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.0);

        // π * r^2 = π * 4
        assertEquals(Math.PI * 4, c.getArea(), 0.0001);
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(2.0);

        // 2πr = 4π
        assertEquals(2 * Math.PI * 2, c.getCircumference(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(5.0);

        String expected = "Circle[radius=5.0]";

        assertEquals(expected, c.toString());
    }
}