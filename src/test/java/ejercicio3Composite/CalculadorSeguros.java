package ejercicio3Composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorSeguros {
    @Test
    public void testCalcularSeguro() {
        Seguro seguro1 = new SeguroVida(1000);
        Seguro seguro2 = new SeguroAuto(2000);
        List<Seguro> seguros = new ArrayList<>();
        seguros.add(seguro1);
        seguros.add(seguro2);
        PaqueteDeSeguros paquete1 = new PaqueteDeSeguros(seguros);
        assertEquals(3000,paquete1.calcularCosto());
    }
}
