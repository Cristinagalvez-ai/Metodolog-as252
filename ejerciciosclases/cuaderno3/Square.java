package matcomp.e1.ejerciciosclases.cuaderno3;

public class Square extends Rectangle {
    /** Constructor del cuadrado por defecto
     */
    public Square() {
        super();
    }
    /** Constructor del cuadrado con lado dado
     */
    public Square(double side) {
        super(side, side);
    }
    /** Constructor del cuadrado con parámetros dados
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Metodos que devuelven y cambian el lado
    public double getSide() {
        return getWidth();  //utiliza el ancho de la subclase Rectangle, y como es un cuadrado da igual usar getWidth o getLength
    }
    public void setSide(double side) {
        super.setWidth(side); //cambiamos el largo y el ancho del rectángulo por el lado del cuadrado
        super.setLength(side);
    }

    //Definimos los métodos setWidth() y setLength()
    @Override
    public void setWidth(double side) {
        super.setWidth(side);   //cambiamos el ancho y el largo porque en un cuadrado si cambias un lado, como son iguales, cambian todos los lados
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /** Metodo que pasa el cuadrado a texto
     */
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";  //utiliza el toString de la subclase Rectangle
    }
}
