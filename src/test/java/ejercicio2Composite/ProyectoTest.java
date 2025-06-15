package ejercicio2Composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoTest {
    @Test
    public void testProyecto() {
        Tarea tarea1 = new Tarea(5);//horas
        Tarea tarea2 = new Tarea(5);//horas
        Tarea tarea3 = new Tarea(5);//horas
        List<Item> tareas = new ArrayList<>();
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        HistoriaUsuario historiaUsuario1 = new HistoriaUsuario(tareas);
        HistoriaUsuario historiaUsuario2 = new HistoriaUsuario(tareas);
        List<Item> items = new ArrayList<>();
        items.add(historiaUsuario1);
        items.add(historiaUsuario2);
        Proyecto proyecto = new Proyecto("Proyecto 1",items);

        assertEquals(30, proyecto.tiempoEstimado());
    }
    @Test
    public void testProyecto2() {
        Tarea tarea1 = new Tarea(10);//horas
        Tarea tarea2 = new Tarea(10);//horas
        Tarea tarea3 = new Tarea(5);//horas
        List<Item> tareas = new ArrayList<>();
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        HistoriaUsuario historiaUsuario1 = new HistoriaUsuario(tareas);
        HistoriaUsuario historiaUsuario2 = new HistoriaUsuario(tareas);
        List<Item> items = new ArrayList<>();
        items.add(historiaUsuario1);
        items.add(historiaUsuario2);
        Proyecto proyecto = new Proyecto("Proyecto 1",items);

        assertEquals(50, proyecto.tiempoEstimado());


    }
}
