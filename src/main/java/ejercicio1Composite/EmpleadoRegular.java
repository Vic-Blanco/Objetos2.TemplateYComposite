package ejercicio1Composite;

public class EmpleadoRegular implements Empleado{

    private double sueldo;

    public EmpleadoRegular(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public double calcularSueldoTotal() {
        return this.sueldo;
    }
}
