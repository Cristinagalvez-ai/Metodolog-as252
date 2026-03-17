package matcomp.e1.ejerciciosclases.cuaderno2;

public class TestMyCircle {
    public static void main(String[] args) {

        //probar en constructor por defecto
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        //probar el constructor con coordenadas y radio dados
        MyCircle c2 = new MyCircle(2,3,5);
        System.out.println(c2);

        //probar el constructor con punto y radio dados
        MyPoint p = new MyPoint(4,6);
        MyCircle c3 = new MyCircle(p,7);
        System.out.println(c3);

        //probar getRadius() y setRadius()
        System.out.println("Radio de c2: " + c2.getRadius());
        c2.setRadius(10);
        System.out.println("Nuevo radio de c2: " + c2.getRadius());

        //probar getCenter() y setCenter()
        System.out.println("Centro de c2: " + c2.getCenter());
        c2.setCenter(new MyPoint(8,9));
        System.out.println("Nuevo centro de c2: " + c2.getCenter());

        //probar getCenterX() y getCenterY()
        System.out.println("Coordenada X de c2: " + c2.getCenterX());
        System.out.println("Coordenada Y de c2: " + c2.getCenterY());

        //probar setCenterX() y setCenterY()
        c2.setCenterX(20);
        c2.setCenterY(30);
        System.out.println("c2 con nuevas coordenadas X e Y: " + c2);

        //probar getCenterXY()
        int[] coords = c2.getCenterXY();
        System.out.println("Centro de c2: (" + coords[0] + "," + coords[1] + ")");
        //probar setCenterXY()
        c2.setCenterXY(1,1);
        System.out.println("Nuevo centro de c2: " + c2.getCenter());

        //probar area
        System.out.println("Área de c2: " + c2.getArea());

        //probar circunferencia
        System.out.println("Circunferencia de c2: " + c2.getCircumference());

        //probar distancia entre 2 círculos
        System.out.println("Distancia entre c2 y c3: " + c2.distance(c3));
    }
}
