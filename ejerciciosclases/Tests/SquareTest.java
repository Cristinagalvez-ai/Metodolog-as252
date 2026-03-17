package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s = new Square(5.0, "red", true);

        assertEquals(5.0, s.getSide(), 0.0001);
    }

    @Test
    void setSide() {
        Square s = new Square(5.0, "red", true);

        s.setSide(10.0);

        assertEquals(10.0, s.getSide(), 0.0001);
        assertEquals(10.0, s.getWidth(), 0.0001);
        assertEquals(10.0, s.getLength(), 0.0001);
    }

    @Test
    void setWidth() {
        Square s = new Square(5.0, "red", true);

        s.setWidth(8.0);

        // en un cuadrado, cambia todo
        assertEquals(8.0, s.getSide(), 0.0001);
        assertEquals(8.0, s.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Square s = new Square(5.0, "red", true);

        s.setLength(12.0);

        // en un cuadrado, cambia todo
        assertEquals(12.0, s.getSide(), 0.0001);
        assertEquals(12.0, s.getWidth(), 0.0001);
    }

    @Test
    void testToString() {
        Square s = new Square(5.0, "red", true);

        String expected = "Square[Rectangle[Shape[color=red,filled=true],width=5.0,length=5.0]]";

        assertEquals(expected, s.toString());
    }
}