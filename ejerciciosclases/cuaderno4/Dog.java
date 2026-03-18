package matcomp.e1.ejerciciosclases.cuaderno4;

public class Dog extends Animal{

    /** Constructor que crea un perro con el nombre dado
     */
    public Dog(String name){
        super(name);
    }

    /** Metodo heredado de la clase abstracta que imprime el sonido del perro
     */
    @Override
    public void greets(){
        System.out.println("Woof");
    }

    /** Metodo que imprime otro sonido del perro dado
     */
    public void greets(Dog another){
        System.out.println("Wooooof");
    }
}
