package ejercicio3Composite;

public abstract class Seguro {

    private double costoBase;

    public Seguro( double costoBase) {
        this.costoBase = costoBase;
    }
    double calcularCosto() {
        return costoBase;
    }
}
