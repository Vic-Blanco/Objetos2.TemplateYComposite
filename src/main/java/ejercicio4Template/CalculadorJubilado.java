package ejercicio4Template;

import static java.time.LocalDate.now;

public class CalculadorJubilado extends Calculador {


    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    public double calcularPrecioMesPromocion(double precioProducto) {
        return precioProducto * 0.1;
    }

    @Override
    public double calcularPrecioMesRegular(double precioProducto) {
        return 0;
    }

}