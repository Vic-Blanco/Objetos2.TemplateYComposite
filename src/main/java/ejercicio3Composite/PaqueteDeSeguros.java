package ejercicio3Composite;

import java.util.List;

public class PaqueteDeSeguros  {
    List<Seguro> seguros;
    /**
     * Clase que representa un paquete de seguros, que puede contener múltiples seguros.
     * Implementa la interfaz Seguro y calcula el costo total de todos los seguros en el paquete.
     */
    public PaqueteDeSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public double calcularCosto() {
        double total = 0;
        for (Seguro seguro : seguros) {
            // Sumar la prima de cada seguro
            total += seguro.calcularCosto();
        }
        return total;
    }
}
