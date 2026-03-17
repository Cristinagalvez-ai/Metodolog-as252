package matcomp.e1.ejerciciosclases.cuaderno2;

public class TestMyPoint {
    public static void main(String[] args) {
        //Example distance(x,y)
        MyPoint p3 = new MyPoint(3, 4);
        System.out.println(p3.distance(5, 6));

        //Example distance(another)
        MyPoint p4 = new MyPoint(3, 4);
        MyPoint p5 = new MyPoint(5, 6);
        System.out.println(p4.distance(p5));

        //Example distance()
        MyPoint p6 = new MyPoint(3, 4);
        System.out.println(p6.distance());

        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        // Test setters and getters
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);

        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // the second one
        System.out.println(p2.distance(p1)); // the second one
        System.out.println(p1.distance(5, 6)); // the first one
        System.out.println(p1.distance()); // the third one
        // because of the kind of parameter

        // 1º creamos el array de 10 puntos
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        // Matriz
        System.out.println(("\nMatriz de distancias:"));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double distancia = points[i].distance(points[j]);
                System.out.printf("(%.2f)   ", distancia);
            }
            System.out.println();
        }
    }
}
