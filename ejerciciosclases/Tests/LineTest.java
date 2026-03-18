package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Line l = new Line(0, 0, 3, 4);

        String expected = "Line[begin=(0,0),end=(3,4)]";

        assertEquals(expected, l.toString());
    }

    @Test
    void getBegin() {
        Line l = new Line(0, 0, 3, 4);

        assertEquals("(0,0)", l.getBegin().toString());
    }

    @Test
    void getEnd() {
        Line l = new Line(0, 0, 3, 4);

        assertEquals("(3,4)", l.getEnd().toString());
    }

    @Test
    void setBegin() {
        Line l = new Line(0, 0, 3, 4);

        Point4 p = new Point4(1, 1);
        l.setBegin(p);

        assertEquals("(1,1)", l.getBegin().toString());
    }

    @Test
    void setEnd() {
        Line l = new Line(0, 0, 3, 4);

        Point4 p = new Point4(2, 2);
        l.setEnd(p);

        assertEquals("(2,2)", l.getEnd().toString());
    }

    @Test
    void getBeginX() {
        Line l = new Line(0, 0, 3, 4);

        assertEquals(0, l.getBeginX());
    }

    @Test
    void getBeginY() {
        Line l = new Line(0, 0, 3, 4);

        assertEquals(0, l.getBeginY());
    }

    @Test
    void getEndX() {
        Line l = new Line(0, 0, 3, 4);

        assertEquals(3, l.getEndX());
    }

    @Test
    void getEndY() {
        Line l = new Line(0, 0, 3, 4);

        assertEquals(4, l.getEndY());
    }

    @Test
    void setBeginX() {
        Line l = new Line(0, 0, 3, 4);

        l.setBeginX(5);

        assertEquals(5, l.getBeginX());
    }

    @Test
    void setBeginY() {
        Line l = new Line(0, 0, 3, 4);

        l.setBeginY(6);

        assertEquals(6, l.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line l = new Line(0, 0, 3, 4);

        l.setBeginXY(7, 8);

        assertEquals(7, l.getBeginX());
        assertEquals(8, l.getBeginY());
    }

    @Test
    void setEndX() {
        Line l = new Line(0, 0, 3, 4);

        l.setEndX(9);

        assertEquals(9, l.getEndX());
    }

    @Test
    void setEndY() {
        Line l = new Line(0, 0, 3, 4);

        l.setEndY(10);

        assertEquals(10, l.getEndY());
    }

    @Test
    void setEndXY() {
        Line l = new Line(0, 0, 3, 4);

        l.setEndXY(11, 12);

        assertEquals(11, l.getEndX());
        assertEquals(12, l.getEndY());
    }

    @Test
    void getLength() {
        Line l = new Line(0, 0, 3, 4);

        // distancia → 5 (triángulo 3-4-5)
        assertEquals(5.0, l.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        Line l = new Line(0, 0, 3, 4);

        // atan((y2 - y1)/(x2 - x1))
        assertEquals(Math.atan2(4, 3), l.getGradient(), 0.0001);
    }
}