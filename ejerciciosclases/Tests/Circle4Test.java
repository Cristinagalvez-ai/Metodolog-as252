package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle4Test {

    @Test
    void getRadius() {
        Circle4 c = new Circle4(5.0, "red");

        assertEquals(5.0, c.getRadius(), 0.0001);
    }

    @Test
    void getColor() {
        Circle4 c = new Circle4(5.0, "red");

        assertEquals("red", c.getColor());
    }

    @Test
    void getArea() {
        Circle4 c = new Circle4(2.0, "blue");

        assertEquals(Math.PI * 4, c.getArea(), 0.0001);
    }

    @Test
    void setRadius() {
        Circle4 c = new Circle4(5.0, "red");

        c.setRadius(10.0);

        assertEquals(10.0, c.getRadius(), 0.0001);
    }

    @Test
    void setColor() {
        Circle4 c = new Circle4(5.0, "red");

        c.setColor("blue");

        assertEquals("blue", c.getColor());
    }

    @Test
    void testToString() {
        Circle4 c = new Circle4(5.0, "red");

        String expected = "Circle[radius=5.0,color=red]";

        assertEquals(expected, c.toString());
    }
}