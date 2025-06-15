package ejercicio1Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(director.calcularSueldoTotal());
    }
}