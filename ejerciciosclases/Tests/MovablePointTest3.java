package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest3 {

    @Test
    void getXSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        assertEquals(3, p.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        p.setXSpeed(10);

        assertEquals(10, p.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        assertEquals(4, p.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        p.setYSpeed(20);

        assertEquals(20, p.getYSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        p.setSpeed(7, 8);

        assertEquals(7, p.getXSpeed());
        assertEquals(8, p.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        float[] speed = p.getSpeed();

        assertEquals(3, speed[0]);
        assertEquals(4, speed[1]);
    }

    @Test
    void testToString() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        String expected = "(1,2),speed=(3,4)";

        assertEquals(expected, p.toString());
    }

    @Test
    void move() {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        p.move();

        // x = 1 + 3 = 4
        // y = 2 + 4 = 6
        assertEquals(4, p.getX());
        assertEquals(6, p.getY());
    }
}