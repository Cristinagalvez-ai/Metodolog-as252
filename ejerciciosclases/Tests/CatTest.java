package matcomp.e1.ejerciciosclases.cuaderno4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CatTest {
    Cat cat = new Cat("Félix");

    @Test
    void greets() {
        cat.greets(); // Verifica que imprime "Meow"
    }
}