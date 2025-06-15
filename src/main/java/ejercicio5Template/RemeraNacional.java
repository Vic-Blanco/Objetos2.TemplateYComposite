package ejercicio5Template;

public class RemeraNacional extends Remera {
    private double recargo = 0.015; // 1.5% de recargo
    private double impuestoAduanero = 0; // 0% de impuesto aduanero
    private double bonificacion = 0.2; // 20% de bonificación
    private double recargoPrecioFinal = 0.15; // 25% de recargo al precio final

    public RemeraNacional (double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    public double aplicarRecargo(double precioUnitario) {
        return precioUnitario  * recargo;
    }

    @Override
    public double impuestoAduanero(double precioUnitario) {
        return precioUnitario * impuestoAduanero;
    }

    @Override
    public double bonificacion(double precioUnitario) {
        return precioUnitario * bonificacion;
    }

    @Override
    public double recargoPrecioFinal(double precioUnitario) {
        return precioUnitario * recargoPrecioFinal;
    }
}
