package ejercicio4Template;

import static java.time.LocalDate.now;

public class CalculadorNoJubilado extends Calculador {
    //private LogTransaction log;

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    public double calcularPrecioMesPromocion(double precioProducto) {
        return precioProducto * 0.15;
    }

    @Override
    public double calcularPrecioMesRegular(double precioProducto) {
        return precioProducto * 0.21;
    }
}
