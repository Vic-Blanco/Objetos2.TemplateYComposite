package ejercicio1Composite;

import java.util.List;

public class Director implements Empleado{
    private double sueldo;
    private List<Gerente> gerentes ;

    public Director(double sueldo, List<Gerente> gerentes) {
        this.sueldo = sueldo;
        this.gerentes = gerentes;
    }

    @Override
    public double calcularSueldoTotal() {
        double total = this.sueldo;
        for (Gerente gerente : gerentes) {
            // Sumar el sueldo de cada gerente
            total += gerente.calcularSueldoTotal();
        }
        return total;
    }
}
