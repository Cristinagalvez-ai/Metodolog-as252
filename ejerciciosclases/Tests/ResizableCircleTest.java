package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ResizableCircleTest {
    ResizableCircle rc = new ResizableCircle(100.0);

    @Test
    void resize() {
        rc.resize(50); // Reducir al 50%
        assertEquals(50.0, rc.radius, 0.001);
    }

    @Test
    void testToString() {
        assertTrue(rc.toString().contains("ResizableCircle"));
    }
}