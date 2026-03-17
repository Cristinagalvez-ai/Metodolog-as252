package matcomp.e1.ejerciciosclases.cuaderno3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    /** Constructor del rectángulo por defecto
     */
    public Rectangle() {
        width = 1.0;
        length = 1.0;
        super();
    }
    /** Constructor del rectangulo con ancho y largo dados
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        super();
    }
    /** Constructor del rectangulo con parametros dados
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super(color, filled);
    }

    // Metodos que devuelven y cambian el ancho del rectángulo
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //Metodos que devuelven y cambian el largo del rectángulo
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    //Metodos que calculan el área y el perímetro del rectángulo
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width + length);
    }

    /** Metodo que pasa el rectángulo a texto
     */
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}
