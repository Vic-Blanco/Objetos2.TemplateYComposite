package ejercicio5Template;

public abstract class Remera  {

    private double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioDeVenta() {
        double base = precioUnitario
                + aplicarRecargo(precioUnitario)
                + impuestoAduanero(precioUnitario)
                - bonificacion(precioUnitario);

        return base + recargoPrecioFinal(base);
    }
    public abstract double aplicarRecargo(double precioUnitario);
    public abstract double impuestoAduanero(double precioUnitario);
    public  abstract double bonificacion(double precioUnitario);
    public abstract double recargoPrecioFinal(double precioUnitario);

}
