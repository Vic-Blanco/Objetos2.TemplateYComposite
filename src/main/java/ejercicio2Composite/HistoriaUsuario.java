package ejercicio2Composite;

import java.util.List;

public class HistoriaUsuario implements Item{
    List<Item> tareas;

    public HistoriaUsuario(List<Item> tareas) {
        this.tareas = tareas;
    }
    @Override
    public double tiempoEstimado() {
        double tiempoTotal = 0;
        for(Item tarea : tareas) {
               tiempoTotal+= tarea.tiempoEstimado();
        }
        return tiempoTotal;
    }
}
