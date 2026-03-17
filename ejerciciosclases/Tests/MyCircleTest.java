package matcomp.e1.ejerciciosclases.cuaderno2;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.*;

class MyCircleTest {
    MyCircle circle = new MyCircle(0, 0, 5);

    @Test
    void getArea() {
        assertEquals(Math.PI * 25, circle.getArea(), 0.001);
    }

    @Test
    void getCircumference() {
        assertEquals(2 * Math.PI * 5, circle.getCircumference(), 0.001);
    }

    @Test
    void getCenterX() {
        assertEquals(0, circle.getCenterX());
    }

    @Test
    void distanceCircles() {
        MyCircle c2 = new MyCircle(3, 4, 1);
        assertEquals(5.0, circle.distance(c2), 0.001);
    }
}

