package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time t = new Time(10, 20, 30);

        assertEquals(10, t.getHour());
    }

    @Test
    void getMinute() {
        Time t = new Time(10, 20, 30);

        assertEquals(20, t.getMinute());
    }

    @Test
    void getSecond() {
        Time t = new Time(10, 20, 30);

        assertEquals(30, t.getSecond());
    }

    @Test
    void setHour() {
        Time t = new Time(10, 20, 30);

        t.setHour(15);

        assertEquals(15, t.getHour());
    }

    @Test
    void setMinute() {
        Time t = new Time(10, 20, 30);

        t.setMinute(45);

        assertEquals(45, t.getMinute());
    }

    @Test
    void setSecond() {
        Time t = new Time(10, 20, 30);

        t.setSecond(50);

        assertEquals(50, t.getSecond());
    }

    @Test
    void setTime() {
        Time t = new Time(10, 20, 30);

        t.setTime(1, 2, 3);

        assertEquals(1, t.getHour());
        assertEquals(2, t.getMinute());
        assertEquals(3, t.getSecond());
    }

    @Test
    void testToString() {
        Time t = new Time(1, 2, 3);

        String expected = "01:02:03";

        assertEquals(expected, t.toString());
    }

    @Test
    void nextSecond() {
        Time t = new Time(10, 20, 30);

        t.nextSecond();

        assertEquals(31, t.getSecond());
        assertEquals(20, t.getMinute());
        assertEquals(10, t.getHour());
    }

    @Test
    void previousSecond() {
        Time t = new Time(10, 20, 30);

        t.previousSecond();

        assertEquals(29, t.getSecond());
        assertEquals(20, t.getMinute());
        assertEquals(10, t.getHour());
    }
}