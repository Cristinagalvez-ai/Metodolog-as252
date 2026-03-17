package matcomp.e1.ejerciciosclases.cuaderno4;

public class TestShape {
    public static void main(String[] args) {
        //este es un caso de polimorfismo, porque la referencia es Shape, y el objeto es Circle
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
    System.out.println(s1); // which version? La versión de la subclase Circle, el toString() sobrecargado
    System.out.println(s1.getArea()); // which version? La versión de Circle
    System.out.println(s1.getPerimeter()); // which version? La versión de Circle
    System.out.println(s1.getColor());
    System.out.println(s1.isFilled());
    //System.out.println(s1.getRadius());   //ERROR: esto no se puede hacer, no podemos llamar a un metodo que no esté en el tipo de referencia shape, da error

        Circle c1 = (Circle) s1; // Downcast back to Circle
    System.out.println(c1);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());
    System.out.println(c1.getColor());
    System.out.println(c1.isFilled());
    System.out.println(c1.getRadius()); //aquí en cambio sí, porque el objeto real ya sí que pertenece a la subclase circle

        //Shape s2 = new Shape();     //ERROR: como Shape es abstracta, no se puede crear un objeto nuevo Shape, solo de las subclases
        //otro caso de polimorfismo, la referencia también es Shape, pero el objeto es Rectangle
        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
    System.out.println(s3);
    System.out.println(s3.getArea());
    System.out.println(s3.getPerimeter());
    System.out.println(s3.getColor());
    //System.out.println(s3.getLength());   //ERROR: aquí tampoco podemos hacer esto, da error, no se puede llamar a un metodo de una subclase desde una superclase

        Rectangle r1 = (Rectangle) s3; // downcast
    System.out.println(r1);
    System.out.println(r1.getArea());
    System.out.println(r1.getColor());
    System.out.println(r1.getLength());
        //polimorfismo, la referencia vuelve a ser Shape, pero el objeto es Square
        Shape s4 = new Square(6.6); // Upcast
    System.out.println(s4);
    System.out.println(s4.getArea());
    System.out.println(s4.getColor());
    //System.out.println(s4.getSide()); //ERROR: aquí también da error porque Shape no tiene getSide()

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;  //y este también es un caso de polimorfismo, porque la referencia ahora es Rectangle, pero el objeto sigue siendo Square
    System.out.println(r2);
    System.out.println(r2.getArea());
    System.out.println(r2.getColor());
    //System.out.println(r2.getSide());   //ERROR:aquí igual, aunque hagamos downcast, como el objeto real no pertenece a la subclase Square sino que pertenece a la superclase Rectangle, nos da error, porque Rectangle no tiene getSide()
    System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
    System.out.println(sq1);
    System.out.println(sq1.getArea());
    System.out.println(sq1.getColor());
    System.out.println(sq1.getSide());
    System.out.println(sq1.getLength());
    }
    //Las clases abstractas sirven como base, por así decirlo,para las subclases y no se puede generar un objeto de una clase abstracta directamente
    //Y los metodos abstractos obligan a las subclases a añadir estos metodos
}