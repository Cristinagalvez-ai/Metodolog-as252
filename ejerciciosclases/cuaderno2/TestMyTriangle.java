package matcomp.e1.ejerciciosclases.cuaderno2;

public class TestMyTriangle {
    public static void main(String[] args) {

        //probar constructor con coordenadas
        MyTriangle t1 = new MyTriangle(0,0,3,0,0,4);
        System.out.println("t1: " + t1);

        //probar constructor con los vértices
        MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(4,1);
        MyPoint p3 = new MyPoint(1,5);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        System.out.println("t2: " + t2);

        //probar getPerimeter()
        System.out.println("Perímetro de t1: " + t1.getPerimeter());
        System.out.println("Perímetro de t2: " + t2.getPerimeter());

        //probar getType()
        System.out.println("El triángulo t1 es: " + t1.getType());
        System.out.println("El triángulo t2 es: " + t2.getType());
    }
}
