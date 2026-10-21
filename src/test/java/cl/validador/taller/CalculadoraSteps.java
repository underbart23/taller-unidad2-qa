package cl.validador.taller;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private Calculadora calculadora;
    private int num1;
    private int num2;
    private int resultadoObtenido;

    @Dado("que ingreso a la calculadora el primer número {int}")
    public void que_ingreso_a_la_calculadora_el_primer_numero(Integer n1) {
        calculadora = new Calculadora();
        this.num1 = n1;
    }

    @Dado("ingreso el segundo número {int}")
    public void ingreso_el_segundo_numero(Integer n2) {
        this.num2 = n2;
    }

    @Dado("que ingreso a la calculadora el número {int}")
    public void que_ingreso_a_la_calculadora_el_numero(Integer n1) {
        calculadora = new Calculadora();
        this.num1 = n1;
    }

    @Dado("ingreso el número {int}")
    public void ingreso_el_numero(Integer n2) {
        this.num2 = n2;
    }

    @Cuando("ejecuto la operación de suma")
    public void ejecuto_la_operacion_de_suma() {
        resultadoObtenido = calculadora.sumar(num1, num2);
    }

    @Entonces("el resultado obtenido debe ser {int}")
    public void el_resultado_obtenido_debe_ser(Integer resultadoEsperado) {
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Entonces("el resultado esperado debe ser {int}")
    public void el_resultado_esperado_debe_ser(Integer resultadoEsperado) {
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
