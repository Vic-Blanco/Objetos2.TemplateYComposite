package ejercicio5Template;

public abstract class Remera  {

    private double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioDeVenta(){
        precioUnitario= precioUnitario + aplicarRecargo(precioUnitario) + impuestoAduanero(precioUnitario) + bonificacion(precioUnitario) + recargoPrecioFinal(precioUnitario);
        return precioUnitario;
    }
    public abstract double aplicarRecargo(double precioUnitario);
    public abstract double impuestoAduanero(double precioUnitario);
    public  abstract double bonificacion(double precioUnitario);
    public abstract double recargoPrecioFinal(double precioUnitario);

}
