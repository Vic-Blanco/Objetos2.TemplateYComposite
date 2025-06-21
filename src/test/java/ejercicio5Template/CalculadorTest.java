package ejercicio5Template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {
    @Test
    void testRemeraImportada() {
        Remera r = new RemeraImportada(1000);
        double esperado = 1350.0;
        assertEquals(esperado, r.calcularPrecioDeVenta(), 0.01);
    }

    @Test
    void testRemeraNacional() {
        Remera r = new RemeraNacional(1000);
        double esperado = 937.25;
        assertEquals(esperado, r.calcularPrecioDeVenta(), 0.01);
    }
}
