package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void testToString() {
        LineSub l = new LineSub(0, 0, 3, 4);

        String expected = "LineSub[begin=(0,0),end=(3,4)]";

        assertEquals(expected, l.toString());
    }

    @Test
    void getBegin() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals("(0,0)", l.getBegin().toString());
    }

    @Test
    void getEnd() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals("(3,4)", l.getEnd().toString());
    }

    @Test
    void setBegin() {
        LineSub l = new LineSub(0, 0, 3, 4);

        Point4 p = new Point4(1, 1);
        l.setBegin(p);

        assertEquals("(1,1)", l.getBegin().toString());
    }

    @Test
    void setEnd() {
        LineSub l = new LineSub(0, 0, 3, 4);

        Point4 p = new Point4(2, 2);
        l.setEnd(p);

        assertEquals("(2,2)", l.getEnd().toString());
    }

    @Test
    void getBeginX() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals(0, l.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals(0, l.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals(3, l.getEndX());
    }

    @Test
    void getEndY() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals(4, l.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub l = new LineSub(0, 0, 3, 4);

        l.setBeginX(5);

        assertEquals(5, l.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub l = new LineSub(0, 0, 3, 4);

        l.setBeginY(6);

        assertEquals(6, l.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub l = new LineSub(0, 0, 3, 4);

        l.setBeginXY(7, 8);

        assertEquals(7, l.getBeginX());
        assertEquals(8, l.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub l = new LineSub(0, 0, 3, 4);

        l.setEndX(9);

        assertEquals(9, l.getEndX());
    }

    @Test
    void setEndY() {
        LineSub l = new LineSub(0, 0, 3, 4);

        l.setEndY(10);

        assertEquals(10, l.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub l = new LineSub(0, 0, 3, 4);

        l.setEndXY(11, 12);

        assertEquals(11, l.getEndX());
        assertEquals(12, l.getEndY());
    }

    @Test
    void getLength() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals(5.0, l.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        LineSub l = new LineSub(0, 0, 3, 4);

        assertEquals(Math.atan2(4, 3), l.getGradient(), 0.0001);
    }
}