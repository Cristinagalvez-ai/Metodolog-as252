package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.MyPoint;

class MyPointTest {
    MyPoint p1 = new MyPoint(3, 4);

    @Test
    void getX() {
        assertEquals(3, p1.getX());
    }

    @Test
    void setX() {
        p1.setX(10);
        assertEquals(10, p1.getX());
    }

    @Test
    void getXY() {
        int[] expected = {3, 4};
        assertArrayEquals(expected, p1.getXY());
    }

    @Test
    void distanceInts() {
        assertEquals(5.0, p1.distance(0, 0), 0.001);
    }

    @Test
    void distancePoint() {
        MyPoint p2 = new MyPoint(0, 0);
        assertEquals(5.0, p1.distance(p2), 0.001);
    }

    @Test
    void distanceOrigin() {
        assertEquals(5.0, p1.distance(), 0.001);
    }
}