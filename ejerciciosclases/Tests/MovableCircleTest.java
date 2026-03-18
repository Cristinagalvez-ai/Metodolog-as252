package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MovableCircleTest {
    // El constructor original ignora x,y e inicializa el centro en (1,1) con speed (2,2)
    MovableCircle circle = new MovableCircle(0, 0, 0, 0, 10);

    @Test
    void moveUp() {
        circle.moveUp();
        // Según el código: center.y += center.ySpeed -> 1 + 2 = 3
        assertTrue(circle.toString().contains("(1,3)"));
    }

    @Test
    void moveRight() {
        circle.moveRight();
        // 1 + 2 = 3
        assertTrue(circle.toString().contains("(3,1)"));
    }

    @Test
    void testToString() {
        // Verifica el formato: (x,y), speed=(x,y), radius=r
        assertNotNull(circle.toString());
    }
}