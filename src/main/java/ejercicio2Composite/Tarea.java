package ejercicio2Composite;

public class Tarea implements Item {
    private double tiempoEstimado;

    public Tarea(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    @Override
    public double tiempoEstimado() {
        return tiempoEstimado;
    }
}
