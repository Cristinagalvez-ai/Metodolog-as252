package matcomp.e1.ejerciciosclases.cuaderno3;

import java.util.concurrent.Callable;

public class TestAnimal {
    public static void main(String[] args) {

        //probar subclase Cat
        Cat c1 = new Cat("Pani");
        System.out.println(c1);

        //probar greets() de Cat
        c1.greets();

        //probar subclase Dog
        Dog d1 = new Dog("Linda");
        System.out.println(d1);

        //probar greets() de Dog
        d1.greets();

        Dog d2 = new Dog("Max");
        d1.greets(d2);

    }
}
