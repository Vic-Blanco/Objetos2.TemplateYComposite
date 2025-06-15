package ejercicio4Template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
public class CalculadorTest {
    @Test
    public void testCalcularJubilado(){
        var calculador = new CalculadorJubilado(LocalDate.now().getMonthValue());
        var calculador2 = new CalculadorJubilado(LocalDate.now().getMonthValue()+1);
        // Llamar al método calcularJubilado con un valor de ejemplo
        double resultadoMesPromo = calculador.calcularPrecio(1000);
        double resultadoMesRegular = calculador2.calcularPrecio(1000);
        // Verificar el resultado esperado
        assertEquals(1100, resultadoMesPromo);
        assertEquals(1000, resultadoMesRegular);
    }
    @Test
    public void testCalcularNoJubilado(){
        // Crear un objeto de la clase Calculador
        var calculador = new CalculadorNoJubilado( LocalDate.now().getMonthValue());
        var calculador2 = new CalculadorNoJubilado(LocalDate.now().getMonthValue()+1);
        // Llamar al método calcularJubilado con un valor de ejemplo
        double resultadoMesPromo = calculador.calcularPrecio(1000);
        double resultadoMesRegular = calculador2.calcularPrecio(1000);
        // Verificar el resultado esperado
        assertEquals(1150, resultadoMesPromo);
        assertEquals(1210, resultadoMesRegular);


    }
}
