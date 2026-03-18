package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DogTest {
    Dog dog = new Dog("Linda");

    @Test
    void greets() {
        dog.greets(); // Imprime "Woof"
    }

    @Test
    void greetsAnotherDog() {
        dog.greets(new Dog("Luna")); // Imprime "Woooof"
    }
}
