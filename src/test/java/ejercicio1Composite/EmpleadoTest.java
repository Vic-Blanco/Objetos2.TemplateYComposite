package ejercicio1Composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
    @Test
    public void testCalcularSueldoTotal() {

        var empleado = new EmpleadoRegular(50);
        var empleado2 = new EmpleadoRegular(50);
        List<EmpleadoRegular> empledosRegulares = new ArrayList<>();
        empledosRegulares.add(empleado);
        empledosRegulares.add(empleado2);
        var lider = new LiderProyecto(100, empledosRegulares);
        var lider2 = new LiderProyecto(100, empledosRegulares);
        List<LiderProyecto> lideresProyecto = new ArrayList<>();
        lideresProyecto.add(lider);
        lideresProyecto.add(lider2);
        var empleado3 = new MandoMedio(200, lideresProyecto);
        var empleado4 = new MandoMedio(200, lideresProyecto);
        List<MandoMedio> mandosMedios = new ArrayList<>();
        mandosMedios.add(empleado3);
        mandosMedios.add(empleado4);
        var empleado5 = new Gerente(300, mandosMedios);
        var empleado6 = new Gerente(300, mandosMedios);
        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(empleado5);
        gerentes.add(empleado6);
        var director = new Director(400, gerentes);

        assertEquals(5600.0,director.calcularSueldoTotal());
    }
    @Test
    public void testCalcularSueldoTotal2() {

        var empleado = new EmpleadoRegular(100);
        var empleado2 = new EmpleadoRegular(100);
        List<EmpleadoRegular> empledosRegulares = new ArrayList<>();
        empledosRegulares.add(empleado);
        empledosRegulares.add(empleado2);
        var lider = new LiderProyecto(200, empledosRegulares);
        var lider2 = new LiderProyecto(200, empledosRegulares);
        List<LiderProyecto> lideresProyecto = new ArrayList<>();
        lideresProyecto.add(lider);
        lideresProyecto.add(lider2);
        var empleado3 = new MandoMedio(400, lideresProyecto);
        var empleado4 = new MandoMedio(400, lideresProyecto);
        List<MandoMedio> mandosMedios = new ArrayList<>();
        mandosMedios.add(empleado3);
        mandosMedios.add(empleado4);
        var empleado5 = new Gerente(600, mandosMedios);
        var empleado6 = new Gerente(600, mandosMedios);
        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(empleado5);
        gerentes.add(empleado6);
        var director = new Director(800, gerentes);

        assertEquals(10400.0,director.calcularSueldoTotal());
    }
}
