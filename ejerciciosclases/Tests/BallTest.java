package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball b = new Ball(1, 2, 5, 1, 1);

        assertEquals(1, b.getX());
    }

    @Test
    void setX() {
        Ball b = new Ball(1, 2, 5, 1, 1);

        b.setX(10);

        assertEquals(10, b.getX());
    }

    @Test
    void getY() {
        Ball b = new Ball(1, 2, 5, 1, 1);

        assertEquals(2, b.getY());
    }

    @Test
    void setY() {
        Ball b = new Ball(1, 2, 5, 1, 1);

        b.setY(20);

        assertEquals(20, b.getY());
    }

    @Test
    void getRadius() {
        Ball b = new Ball(1, 2, 5, 1, 1);

        assertEquals(5, b.getRadius());
    }

    @Test
    void setRadius() {
        Ball b = new Ball(1, 2, 5, 1, 1);

        b.setRadius(10);

        assertEquals(10, b.getRadius());
    }

    @Test
    void getXDelta() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        assertEquals(3, b.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        b.setXDelta(7);

        assertEquals(7, b.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        assertEquals(4, b.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        b.setYDelta(9);

        assertEquals(9, b.getYDelta());
    }

    @Test
    void move() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        b.move();

        // x = 1 + 3 = 4
        // y = 2 + 4 = 6
        assertEquals(4, b.getX());
        assertEquals(6, b.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        b.reflectHorizontal();

        // cambia signo de yDelta
        assertEquals(-4, b.getYDelta());
    }

    @Test
    void reflectVertical() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        b.reflectVertical();

        // cambia signo de xDelta
        assertEquals(-3, b.getXDelta());
    }

    @Test
    void testToString() {
        Ball b = new Ball(1, 2, 5, 3, 4);

        String expected = "Ball[(1,2),speed=(3,4)]";

        assertEquals(expected, b.toString());
    }
}