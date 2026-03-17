package matcomp.e1.ejerciciosclases.cuaderno4;

public class TestGeometricObject {
    public static void main(String[] args) {
        // Creamos un objeto Circle, pero la referencia es de tipo matcomp.e1.ejerciciosclases.cuaderno4.GeometricObject
        GeometricObject g1 = new Circlee(5.0);

        // Mostramos el objeto
        System.out.println(g1);

        // Calculamos el área
        System.out.println("Area of g1: " + g1.getArea());

        // Calculamos el perímetro
        System.out.println("Perimeter of g1: " + g1.getPerimeter());

        // Creamos un objeto Rectangle, pero la referencia es de tipo matcomp.e1.ejerciciosclases.cuaderno4.GeometricObject
        GeometricObject g2 = new Rectanglee(4.0, 6.0);

        // Mostramos el objeto
        System.out.println(g2);

        // Calculamos el área
        System.out.println("Area of g2: " + g2.getArea());

        // Calculamos el perímetro
        System.out.println("Perimeter of g2: " + g2.getPerimeter());
    }
}
