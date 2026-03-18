package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MovablePointTest {
    MovablePoint p = new MovablePoint(0, 0, 5, 5);

    @Test
    void moveUp() {
        p.moveUp();
        assertEquals(-5, p.y);
    }

    @Test
    void moveDown() {
        p.moveDown();
        assertEquals(5, p.y);
    }

    @Test
    void moveLeft() {
        p.moveLeft();
        assertEquals(-5, p.x);
    }

    @Test
    void moveRight() {
        p.moveRight();
        assertEquals(5, p.x);
    }

    @Test
    void testToString() {
        assertEquals("(0, 0) speed=(5, 5)", p.toString());
    }
}
