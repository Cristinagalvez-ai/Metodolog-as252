package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.*;

class MyLineTest {
    MyLine line = new MyLine(0, 0, 3, 4);

    @Test
    void getLength() {
        assertEquals(5.0, line.getLength(), 0.001);
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan2(4, 3), line.getGradient());
    }

    @Test
    void setBeginXY() {
        line.setBeginXY(1, 1);
        assertEquals(1, line.getBeginX());
    }

    @Test
    void testToString() {
        assertEquals("MyLine[begin=(0,0),end=(3,4)]", line.toString());
    }
}