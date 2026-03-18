package matcomp.e1.ejerciciosclases.cuaderno4;

public class BigDog extends Dog {

    /** Constructor que crea un perro grande con el nombre dado
     */
    public BigDog(String name){
        super(name);
    }

    /** Metodo que imprime un sonido por defecto
     */
    @Override
    public void greets(){
        System.out.println("Woow");
    }

    /** Metodo que imprime otro sonido por el perro dado
     */
    @Override
    public void greets(Dog another){
        System.out.println("Wooooow");
    }

    /** Metodo que imprime otro sonido por el perro grande dado
     */
    public void greets(BigDog another){
        System.out.println("Woooooooow");
    }
}
