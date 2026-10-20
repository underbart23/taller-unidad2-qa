package cl.validador.taller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3), "La suma de 2 + 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calc.restar(3, 2), "La resta de 3 - 2 debe ser 1");
    }
}