package matcomp.e1.ejerciciosclases.cuaderno1;

public class Rectangle {
    private float length;
    private float width;

    /** Constructor de un rectángulo por defecto
     */
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    /** Constructor de un rectángulo con el largo y el ancho dados
     */
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    /** Metodo que devuelve el largo del rectángulo
     */
    public float getLength() {
        return length;
    }

    /** Metodo que cambia el largo del rectángulo
     */
    public void setLength(float length) {
        this.length = length;
    }

    /** Metodo que devuelve el ancho del rectángulo
     */
    public float getWidth() {
        return width;
    }
    /** Metodo que cambia el ancho del rectángulo
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /** Metodo que calcula el area del rectángulo
     */
    public double getArea() {
        return length*width;
    }

    /** Metodo que calcula el perímetro del rectángulo
     */
    public double getPerimeter() {
        return 2*(length + width);
    }

    /** Metodo que pasa el rectángulo a texto
     */
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
