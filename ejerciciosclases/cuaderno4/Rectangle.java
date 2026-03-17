package matcomp.e1.ejerciciosclases.cuaderno4;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    /** Constructor que crea un rectángulo por defecto
     */
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }
    /** Constructor que crea un rectángulo con el largo y el ancho dados
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    /** Constructor que crea un rectángulo con los parámetros dados
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** Metodo que devuelve el ancho
     */
    public double getWidth() {
        return width;
    }
    /** Metodo que cambia el ancho
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /** Metodo que devuelve el largo
     */
    public double getLength() {
        return length;
    }
    /** Metodo que cambia el largo
     */
    public void setLength(double length) {
        this.length = length;
    }

    /** Metodo sobrecargado que calcula el área
     */
    @Override
    public double getArea() {
        return width*length;
    }
    /** Metodo sobrecargado que calcula el perímetro
     */
    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    /** Metodo sobrecargado que pasa el rectángulo a texto
     */
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}
