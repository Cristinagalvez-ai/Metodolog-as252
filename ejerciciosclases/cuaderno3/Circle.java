package matcomp.e1.ejerciciosclases.cuaderno3;

public class Circle extends Shape {
    private double radius;

    /** Constructor del círculo por defecto
     */
    public Circle() {
        radius = 1.0;
        super();
    }
    /** Constructor del círculo con radio dado
     */
    public Circle(double radius) {
        this.radius = radius;
        super();
    }
    /** Constructor del círculo con parámetros dados
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super(color, filled);
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

    /** Metodo que calcula el área del círculo
     */
    public double getArea() {
        return Math.PI*radius*radius;
    }

    /** Metodo que calcula el perímetro del circulo
     */
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    /** Metodo que pasa el círculo a texto
     */
    @Override
    public String toString() {
        return "Circle[" + super.toString()     //utiliza el toString() de la superclase Shape
                + ",radius=" + radius + "]";
    }
}
