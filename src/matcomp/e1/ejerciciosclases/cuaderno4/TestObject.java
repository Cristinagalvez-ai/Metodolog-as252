package matcomp.e1.ejerciciosclases.cuaderno4;

public class TestObject {
    public static void main(String[] args){
        //creamos el objeto círculo y probamos sus metodos
        GeometricObject c1 = new Circlee(2.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        //creamos un objeto de rectangulo y probamos sus metodos
        GeometricObject r1 =new Rectanglee(3.0, 4.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        //creamos un círculo para cambiarle el tamaño y probamos cambiarle el tamaño
        Resizable re1=new ResizableCircle(2.0);
        System.out.println(re1);
        re1.resize(10);
        System.out.println(re1);
    }
}
