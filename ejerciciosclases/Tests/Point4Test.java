package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point4Test {

    @Test
    void testToString() {
        Point4 p = new Point4(1, 2);

        String expected = "(1,2)";

        assertEquals(expected, p.toString());
    }

    @Test
    void getX() {
        Point4 p = new Point4(1, 2);

        assertEquals(1, p.getX());
    }

    @Test
    void getY() {
        Point4 p = new Point4(1, 2);

        assertEquals(2, p.getY());
    }

    @Test
    void setX() {
        Point4 p = new Point4(1, 2);

        p.setX(10);

        assertEquals(10, p.getX());
    }

    @Test
    void setY() {
        Point4 p = new Point4(1, 2);

        p.setY(20);

        assertEquals(20, p.getY());
    }

    @Test
    void setXY() {
        Point4 p = new Point4(1, 2);

        p.setXY(5, 6);

        assertEquals(5, p.getX());
        assertEquals(6, p.getY());
    }
}