package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point4 p1 = new Point4(5,6);
        Point4 p2 = new Point4(7,8);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        System.out.println("Begin of l2: " + l2.getBegin());
        System.out.println("End of l2: " + l2.getEnd());

        l2.setBeginX(10);
        l2.setBeginY(20);
        l2.setEndXY(30,40);
        System.out.println("L2 nuevo: " + l2);
        System.out.println("Length of l2: " + l2.getLength());
        System.out.println("Gradient of l2: " + l2.getGradient());
    }
}
