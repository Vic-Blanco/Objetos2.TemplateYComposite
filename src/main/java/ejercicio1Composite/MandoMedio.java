package ejercicio1Composite;

import java.util.List;

public class MandoMedio implements Empleado {
    private double sueldo;
    private List<LiderProyecto> lideresProyecto;

    public MandoMedio(double sueldo, List<LiderProyecto> lideresProyecto) {
        this.sueldo = sueldo;
        this.lideresProyecto = lideresProyecto;
    }

    @Override
    public double calcularSueldoTotal() {
        double total = this.sueldo;
        for (LiderProyecto liderProyecto : lideresProyecto) {
            // Sumar el sueldo de cada líder de proyecto
            total += liderProyecto.calcularSueldoTotal();
        }
        return total;
    }
}
