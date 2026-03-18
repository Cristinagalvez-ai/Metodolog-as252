package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p = new Point(1, 2);

        assertEquals(1, p.getX());
    }

    @Test
    void setX() {
        Point p = new Point(1, 2);

        p.setX(10);

        assertEquals(10, p.getX());
    }

    @Test
    void getY() {
        Point p = new Point(1, 2);

        assertEquals(2, p.getY());
    }

    @Test
    void setY() {
        Point p = new Point(1, 2);

        p.setY(20);

        assertEquals(20, p.getY());
    }

    @Test
    void setXY() {
        Point p = new Point(1, 2);

        p.setXY(5, 6);

        assertEquals(5, p.getX());
        assertEquals(6, p.getY());
    }

    @Test
    void getXY() {
        Point p = new Point(1, 2);

        float[] coords = p.getXY();

        assertEquals(1, coords[0]);
        assertEquals(2, coords[1]);
    }

    @Test
    void testToString() {
        Point p = new Point(1, 2);

        String expected = "(1,2)";

        assertEquals(expected, p.toString());
    }
}