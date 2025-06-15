package ejercicio5Template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {
    @Test
    public void testCalularCostoRemera(){
        var remeraImportada = new RemeraImportada(100);
        var remeraNacional = new RemeraNacional(100);

        assertEquals(133.0,remeraImportada.calcularPrecioDeVenta());
        assertEquals(136.5,remeraNacional.calcularPrecioDeVenta());
    }
}
