package matcomp.e1.ejerciciosclases.cuaderno4;

public class TestAnimal {
    public static void main(String[] args){
        //probar crear un Animal de elemento gato y su sonido
        Animal c1=new Cat("Canela");
        c1.greets();

        //probar crear un Animal de elemento perro y su sonido
        Animal d1 =new Dog("Nube");
        d1.greets();
        Animal d2 =new Dog("Linda");
        ((Dog)d1).greets((Dog)d2);

        //probar crear un Animal de elemento bigdog y su sonido
        Animal b1 =new BigDog("Luna");
        b1.greets();
        ((Dog)d1).greets((BigDog)b1);
    }
}
