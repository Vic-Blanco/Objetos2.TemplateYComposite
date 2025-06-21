package ejercicio2Composite;

import java.util.List;

public class Proyecto implements Item {
    List<Item> items;

    public Proyecto(String nombre, List<Item> HistoriasUsuario) {
        this.items = HistoriasUsuario;
    }

    public double tiempoEstimado() {
        double tiempoTotal = 0;
        for(Item item : items) {
            tiempoTotal += item.tiempoEstimado();
        }
        return tiempoTotal;
    }
}
