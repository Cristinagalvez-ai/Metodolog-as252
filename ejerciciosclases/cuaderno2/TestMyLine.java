package matcomp.e1.ejerciciosclases.cuaderno2;

public class TestMyLine {
    public static void main(String[] args) {

        //probar el constructor con 4 enteros
        MyLine line1 = new MyLine(1,2,4,6); //creamos una línea usando el constructor con coordenadas
        System.out.println("line1: " + line1);

        //probar el constructor con 2 puntos
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("line2: " + line2);

        //probar getBegin() y getEnd()
        System.out.println("Begin de line2: " + line2.getBegin());
        System.out.println("End de line2: " + line2.getEnd());

        //probar setBegin() y setEnd()
        line2.setBegin(new MyPoint(1,1));
        line2.setEnd(new MyPoint(5,5));
        System.out.println("Nueva line2: " + line2);

        //probar getters de las coordenadas individuales
        System.out.println("BeginX: " + line2.getBeginX());
        System.out.println("BeginY: " + line2.getBeginY());
        System.out.println("EndX: " + line2.getEndX());
        System.out.println("EndY: " + line2.getEndY());

        //probar setters de las coordenadas individuales
        line2.setBeginX(10);
        line2.setBeginY(20);
        line2.setEndX(30);
        line2.setEndY(40);
        System.out.println("Nueva line2: " + line2);

        //Probar getBeginXY() y getEndXY()
        int[] beginCoords = line2.getBeginXY();
        int[] endCoords = line2.getEndXY();
        System.out.println("BeginXY: (" + beginCoords[0] + "," + beginCoords[1] + ")");
        System.out.println("EndXY: (" + endCoords[0] + "," + endCoords[1] + ")");

        //probar setBeginXY() y setEndXY()
        line2.setBeginXY(2,3);
        line2.setEndXY(7,9);
        System.out.println("Nueva line2: " + line2);

        //probar longitud
        System.out.println("Longitud de line2: " + line2.getLength());

        //probar ángulo de la línea
        System.out.println("Ángulo de line2 en radianes: " + line2.getGradient());
    }
}
