package ejercicio1Composite;

import java.util.List;

public class Gerente implements Empleado{
    private double sueldo;
    private List<MandoMedio> mandosMedios;

    public Gerente(double sueldo, List<MandoMedio> mandosMedios) {
        this.sueldo = sueldo;
        this.mandosMedios = mandosMedios;
    }
    @Override
    public double calcularSueldoTotal() {
        double total = this.sueldo;
        for (MandoMedio mandoMedio : mandosMedios) {
            // Sumar el sueldo de cada mando medio
            total += mandoMedio.calcularSueldoTotal();
        }
        return total ;
    }
}
