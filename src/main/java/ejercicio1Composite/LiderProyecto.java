package ejercicio1Composite;

import java.util.List;

public class LiderProyecto implements Empleado{
    private double sueldo;
    private List<EmpleadoRegular> empleadosRegulares;

    public LiderProyecto(double sueldo, List<EmpleadoRegular> empleadosRegulares) {
        this.sueldo = sueldo;
        this.empleadosRegulares = empleadosRegulares;
    }
    @Override
    public double calcularSueldoTotal() {
        double total = this.sueldo;
        for (EmpleadoRegular empleadoRegular : empleadosRegulares) {
            // Sumar el sueldo de cada empleado regular
            total += empleadoRegular.calcularSueldoTotal();
        }
        return total;
    }
}
