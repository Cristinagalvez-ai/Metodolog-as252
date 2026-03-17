package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestLineSub {
    public static void main(String[] args) {
        //Crear una línea con coordenadas dadas
        LineSub l1 = new LineSub(0,0,3,4);
        System.out.println(l1);

        //Crear una línea con 2 puntos dados
        Point4 p1 = new Point4(5,6);
        Point4 p2 = new Point4(7,8);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);

        //probar getBegin() y getEnd()
        System.out.println("Begin of l2: " + l2.getBegin());
        System.out.println("End of l2: " + l2.getEnd());

        //probar getters de coordenadas
        System.out.println("BeginX: " + l2.getBeginX());
        System.out.println("BeginY: " + l2.getBeginY());
        System.out.println("EndX: " + l2.getEndX());
        System.out.println("EndY: " + l2.getEndY());

        //Cambiar begin y end
        l2.setBeginX(10);
        l2.setBeginY(20);
        l2.setEndXY(30,40);
        System.out.println("L2 nuevo: " + l2);

        //Probar longitud y gradiente
        System.out.println("Longitud de l2: " + l2.getLength());
        System.out.println("Gradiente de l2: " + l2.getGradient());
    }
}
