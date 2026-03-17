package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestPoint {
    public static void main(String[] args) {

        //probar crear un punto en la superclase Point
        Point p1 = new Point(2.0f,3.0f);
        System.out.println("Punto 1: " + p1);

        //probar crear un objeto en la subclase MovablePoint
        MovablePoint movablep1 = new MovablePoint(1.0f,2.0f,0.5f,1.0f);
        System.out.println("movablep1: " + movablep1);

        //probar mover el punto
        movablep1.move();
        System.out.println("movablep1 después de mover: " + movablep1);

        //probar setSpeed()
        movablep1.setSpeed(2.0f,3.0f);
        System.out.println("movablep1 con nueva velocidad: " + movablep1);

        //movemos el punto otra vez con la nueva velocidad
        movablep1.move();
        System.out.println("movablep1 después de mover otra vez: " + movablep1);
    }
}
