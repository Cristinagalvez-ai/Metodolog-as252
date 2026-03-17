package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestPoint4 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20); // Construct a Point
        System.out.println(p1);

        // Try setting p1 to (100, 10).
        p1.setXY(100,10);
        System.out.println(p1);
    }

}
