package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p = new Point2D(1.5f, 2.5f);

        assertEquals(1.5f, p.getX(), 0.0001);
    }

    @Test
    void setX() {
        Point2D p = new Point2D(1.5f, 2.5f);

        p.setX(3.5f);

        assertEquals(3.5f, p.getX(), 0.0001);
    }

    @Test
    void getY() {
        Point2D p = new Point2D(1.5f, 2.5f);

        assertEquals(2.5f, p.getY(), 0.0001);
    }

    @Test
    void setY() {
        Point2D p = new Point2D(1.5f, 2.5f);

        p.setY(4.5f);

        assertEquals(4.5f, p.getY(), 0.0001);
    }

    @Test
    void getXY() {
        Point2D p = new Point2D(1.5f, 2.5f);

        float[] coords = p.getXY();

        assertEquals(1.5f, coords[0], 0.0001);
        assertEquals(2.5f, coords[1], 0.0001);
    }

    @Test
    void setXY() {
        Point2D p = new Point2D(1.5f, 2.5f);

        p.setXY(6.5f, 7.5f);

        assertEquals(6.5f, p.getX(), 0.0001);
        assertEquals(7.5f, p.getY(), 0.0001);
    }

    @Test
    void testToString() {
        Point2D p = new Point2D(1.5f, 2.5f);

        String expected = "(1.5,2.5)";

        assertEquals(expected, p.toString());
    }
}