package es.uah.matcomp.mp.e1.ejerciciosclases.practica4;

public class TestAnimal {
    public static void main(String[] args){
        Animal c1=new Cat("Canela");
        c1.greets();

        Animal d1 =new Dog("Nube");
        d1.greets();
        Animal d2 =new Dog("Linda");
        ((Dog)d1).greets((Dog)d2);

        Animal b1 =new BigDog("Luna");
        b1.greets();
        ((Dog)d1).greets((BigDog)b1);
    }
}
