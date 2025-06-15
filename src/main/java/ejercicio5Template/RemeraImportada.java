package ejercicio5Template;

public class RemeraImportada extends Remera{
    private double recargo = 0.03; // 3% de recargo
    private double impuestoAduanero = 0.05; // 5% de impuesto aduanero
    private double bonificacion = 0; // 0% de bonificación
    private double recargoPrecioFinal = 0.25; // 25% de recargo al precio final

    public RemeraImportada (double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    public double aplicarRecargo(double precioUnitario) {
        return precioUnitario * recargo;
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
