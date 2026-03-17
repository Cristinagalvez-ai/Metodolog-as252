package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(5.0, "red", true);

        assertEquals(5.0, c.getRadius(), 0.0001);
    }

    @Test
    void setRadius() {
        Circle c = new Circle(5.0, "red", true);

        c.setRadius(10.0);

        assertEquals(10.0, c.getRadius(), 0.0001);
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.0, "red", true);

        assertEquals(Math.PI * 4, c.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(2.0, "red", true);

        assertEquals(2 * Math.PI * 2, c.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(5.0, "red", true);

        String expected = "Circle[Shape[color=red,filled=true],radius=5.0]";

        assertEquals(expected, c.toString());
    }
}