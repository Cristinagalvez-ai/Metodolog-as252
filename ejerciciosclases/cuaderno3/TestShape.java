package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestShape {
    public static void main(String[] args) {

        //probar Shape
        Shape s1 = new Shape();
        System.out.println("Shape1: " + s1);

        Shape s2 = new Shape("blue",false);
        System.out.println("Shape2: " + s2);

        //probar Circle
        Circle c1 = new Circle();
        System.out.println("Circle1: " + c1);
        System.out.println("Radio de circle1: " + c1.getRadius());
        System.out.println("Área de circle1: " + c1.getArea());
        System.out.println("Perímetro de circle1: " + c1.getPerimeter());

        Circle c2 = new Circle(2.5,"green",true);
        System.out.println("Circle2: " + c2);
        System.out.println("Radio de circle2: " + c2.getRadius());
        System.out.println("Área de circle2: " + c2.getArea());
        System.out.println("Perímetro de circle2: " + c2.getPerimeter());

        //Probar Rectangle
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle1: " + r1);
        System.out.println("Ancho de rectangle1: " + r1.getWidth());
        System.out.println("Largo de rectangle1: " + r1.getLength());
        System.out.println("Área de rectangle1: " + r1.getArea());
        System.out.println("Perímetro de rectangle1: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(4.0,6.0,"yellow",false);
        System.out.println("Rectangle2: " + r2);
        System.out.println("Ancho de rectangle2: " + r2.getWidth());
        System.out.println("Largo de rectangle2: " + r2.getLength());
        System.out.println("Área de rectangle2: " + r2.getArea());
        System.out.println("Perímetro de rectangle2: " + r2.getPerimeter());

        //probar square
        Square sq1 = new Square();
        System.out.println("Square1: " + sq1);

        Square sq2 = new Square(5.0);
        System.out.println("Square2: " + sq2);
        System.out.println("Lado de square2: " + sq2.getSide());
        System.out.println("Área de square2: " + sq2.getArea());
        System.out.println("Perímetro de square2: " + sq2.getPerimeter());

        Square sq3 = new Square(3.0,"black",true);
        System.out.println("Square3: " + sq3);

        //probar setters de Square
        sq3.setSide(7.0);
        System.out.println("Square3 nuevo: " + sq3);

        sq3.setWidth(2.0);
        System.out.println("Square3 nuevo2: " + sq3);
        sq3.setLength(4.0);
        System.out.println("Square3 nuevo3: " + sq3);
    }
}
