package matcomp.e1.ejerciciosclases.cuaderno4;

public class Circle extends Shape{
    protected double radius;

    /** Constructor que crea un círculo por defecto
     */
    public Circle() {
        super();
        radius = 1.0;
    }
    /** Constructor que crea un círculo con el radio dado
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    /** Constructor que crea un círculo con los parámetros dados
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Metodo que devuelve el radio
     */
    public double getRadius() {
        return radius;
    }
    /** Metodo que cambia el radio
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Metodo sobrecargado que calcula el área del círculo
     */
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    /** Metodo sobrecargado que calcula el perímetro del círculo
     */
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    /** Metodo sobrecargado que pasa el círculo a texto
     */
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
