package ejercicio4Template;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    //private LogTransaction log;
    private int mesEnPromocion;

    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }
    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += this.calcularPrecioMesPromocion(precioProducto);
        } else {
            precioTotal += this.calcularPrecioMesRegular(precioProducto);
        }
        //log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }
    public abstract double calcularPrecioMesPromocion(double precioProducto);
    public abstract double calcularPrecioMesRegular(double precioProducto);
}
