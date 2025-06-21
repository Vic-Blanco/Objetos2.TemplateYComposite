package ejercicio3Composite;

import java.util.List;

public class PaqueteDeSeguros  {
    List<Seguro> seguros;

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
