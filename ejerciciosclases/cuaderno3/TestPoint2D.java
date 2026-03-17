package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestPoint2D {
    public static void main(String[] args) {

        //probar crear un objeto Point2D y su toString()
        Point2D punto2D = new Point2D(3.5f,4.5f);
        System.out.println("Punto 2D: " + punto2D);

        //probar setters de la superclase
        punto2D.setX(10.0f);
        punto2D.setY(20.0f);
        System.out.println("Punto 2D nuevo: " + punto2D);

        //probar getXY de la superclase
        float[] xy = punto2D.getXY();
        System.out.println("Array XY: " + xy[0] + "," + xy[1]);

        //probar crear un objeto Point3D y su toString()
        Point3D punto3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println("Punto 3D: " + punto3D);

        //probar setXYZ de la subclase
        punto3D.setXYZ(7.0f,8.0f,9.0f);
        System.out.println("Punto 3D nuevo: " + punto3D);

        //probar getXYZ de la subclase
        float[] xyz = punto3D.getXYZ();
        System.out.println("Array XYZ: " + xyz[0] + "," + xyz[1] + "," + xyz[2]);
    }
}
