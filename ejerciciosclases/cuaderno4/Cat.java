package matcomp.e1.ejerciciosclases.cuaderno4;

public class Cat extends Animal{

    /** Constructor que crea un gato con el nombre dado
     */
    public Cat(String name){
        super(name);
    }

    /** Metodo que hereda de la clase abstracta que imprime el sonido del gato
     */
    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
