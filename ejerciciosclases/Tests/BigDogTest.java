package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BigDogTest {
    BigDog bigDog = new BigDog("Titan");

    @Test
    void greets() {
        bigDog.greets(); // Imprime "Woow"
    }

    @Test
    void greetsAnotherDog() {
        bigDog.greets(new Dog("Rex")); // Imprime "Wooooow"
    }

    @Test
    void greetsAnotherBigDog() {
        bigDog.greets(new BigDog("Max")); // Imprime "Woooooooow"
    }
}