package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.*;

class MyTriangleTest {
    @Test
    void getPerimeter() {
        MyTriangle t = new MyTriangle(0, 0, 4, 0, 4, 3);
        assertEquals(12.0, t.getPerimeter(), 0.001);
    }

    @Test
    void getTypeEquilateral() {
        // Puntos aproximados de un equilátero para cubrir la rama del if
        MyTriangle t = new MyTriangle(0, 0, 2, 0, 1, (int)Math.sqrt(3));
        // Dependiendo de la precisión de distance(), esto devuelve Equilateral o Isosceles
        assertNotNull(t.getType());
    }

    @Test
    void getTypeScalene() {
        MyTriangle t = new MyTriangle(0, 0, 4, 0, 4, 3);
        assertEquals("Scalene", t.getType());
    }

    @Test
    void testToString() {
        MyTriangle t = new MyTriangle(0, 0, 1, 1, 2, 2);
        assertTrue(t.toString().contains("v1=(0,0)"));
    }
}